package ex01;
import ex01.llm.LLM;
import ex01.llm.ModelCategory;
import ex01.slack.Slack;
import ex01.util.logger.MyLogger;
import ex01.util.logger.MyLoggerLevel;
import ex01.util.secret.MySecret;
import ex01.util.secret.NoEnvException;
import ex01.util.secret.SecretCategory;
import ex01.util.webclient.WebClient;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.*;


/**
 * Application 클래스는 LLM 요청을 병렬로 처리하고 결과를 Slack으로 전송하는 메인 로직을 포함한다.
 */
public class Application {

    public static void main(String[] args) throws NoEnvException, InterruptedException, IOException, ExecutionException {
        // 로깅 인스턴스 생성
        MyLogger logger = MyLogger.getLogger();
        Slack slack = new Slack();
        LLM llm = new LLM();

        // 시작 시간 기록
        long startTime = System.currentTimeMillis();
        logger.info("START!");

        // 초기 AI 결과 생성 (짧은 설명 요청)
        String aiResult = llm.sendPrompt(ModelCategory.LLAMA, "밴드 악기 중 하나인 베이스에 대해 100자 이내로 설명해줘. 한글이나 한국어로만 작성해주고, 적절한 이모지도 함께 추가해줘. 앞뒤 제목이나 설명글 없이 내용만 작성해줘.");

        // 병렬 작업을 위한 스레드 풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 이미지 생성 작업을 병렬로 제출
        LLMTask imageTask = new LLMTask(
                ModelCategory.FLUX,
                "%s is a description of the bass guitar. Please refer to this explanation to create a animals heavy metal band that hits the base. You must include animals music rock band".formatted(aiResult)
        );
        Future<String> imageFuture = executor.submit((Callable<String>) imageTask);

        // 상세한 설명 생성을 병렬로 제출
        LLMTask reasoningTask = new LLMTask(
                ModelCategory.R1,
                "%s는 베이스 기타에 대한 설명이야. 이 정보를 바탕으로 일렉 기타와 베이스 기타의 차이에 대해 설명해줘. 한글이나 한국어로만 작성해주고 적절한 이모지도 넣어줘"
                        .formatted(aiResult)
        );
        Future<String> reasoningFuture = executor.submit((Callable<String>) reasoningTask);

        LLMTask reasoningTask2 = new LLMTask(
                ModelCategory.R1,
                "%s는 베이스 기타에 관한 설명글이야. 이걸 바탕으로 베이스 기타를 칭찬하는 글을 작성해줘. 한글이나 한국어로만 작성해주고 적절한 이모지도 넣어줘".formatted(aiResult)
        );
        Future<String> reasoningFuture2 = executor.submit((Callable<String>) reasoningTask2);

        // 모든 작업의 결과를 받아옴
        String imageResult = imageFuture.get();
        String reasoningResult = reasoningFuture.get();
        String reasoningResult2 = reasoningFuture2.get();

        // Slack에 결과 메시지 전송
        slack.sendMessage(imageResult, "%s \n %s".formatted(reasoningResult, reasoningResult2));

        // 스레드 풀 종료
        executor.shutdown();

        // 종료 시간 및 소요 시간 로깅
        logger.info("FINISH! %d".formatted(System.currentTimeMillis() - startTime));
    }
}

/**
 * LLMTask 클래스는 LLM 모델을 통해 주어진 프롬프트에 대한 응답을 얻어오는 작업을 정의한다.
 * 이 클래스는 Callable 및 Runnable 인터페이스를 구현해 ExecutorService에서 실행 가능하다.
 */
class LLMTask implements Runnable, Callable<String> {
    private final LLM llm;
    private final String prompt;
    private final ModelCategory model;
    private String result;

    /**
     * LLMTask 생성자
     *
     * @param model 사용할 LLM 모델의 카테고리
     * @param prompt 모델에 전달할 프롬프트 문자열
     * @throws NoEnvException 환경 변수 문제가 발생할 경우 던져짐
     */
    LLMTask(ModelCategory model, String prompt) throws NoEnvException {
        llm = new LLM();
        this.prompt = prompt;
        this.model = model;
    }

    /**
     * Runnable 인터페이스 구현 메서드.
     * ExecutorService가 이 작업을 실행할 때 사용됨.
     */
    @Override
    public void run() {
        try {
            result = llm.sendPrompt(model, prompt);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Callable 인터페이스 구현 메서드.
     * 작업의 결과값을 Future로 반환함.
     *
     * @return LLM 모델로부터 받은 응답 문자열
     * @throws Exception 작업 수행 중 발생할 수 있는 예외
     */
    @Override
    public String call() throws Exception {
        run();
        return result;
    }
}

//public class Application {
//    public static void main(String[] args) throws NoEnvException, InterruptedException, IOException {
//        MyLogger logger = MyLogger.getLogger();
//        LLM llm = new LLM();
//        Slack slack = new Slack();
//
//        long startTime = System.currentTimeMillis();
//        logger.info("START!");
//
//        String aiResult = llm.sendPrompt(ModelCategory.LLAMA, "밴드 악기 중 하나인 베이스에 대해 200자 이내로 설명해줘. 베이스와 일렉기타의 차이에 대해 알려주는 동시에 베이스 기타를 무시하고 장난치는 글도 작성해줘. 적절한 이모지도 함께 추가해주고 앞뒤 제목이나 설명글 없이 내용만 작성해줘.");
////        System.out.println(aiResult);
//
//        String imageResult = llm.sendPrompt(ModelCategory.FLUX, "%s is a description of the bass guitar. Please refer to this explanation to create a Cat heavy metal band that hits the base. You must include cat music rock band".formatted(aiResult));
//
//
//
//        String reasoning = llm.sendPrompt(ModelCategory.R1, "Select keywords from %s, write more information or methods for that keyword within 400 characters. only use Korean character".formatted(aiResult));
//        System.out.println(reasoning);
//
//        slack.sendMessage(aiResult, imageResult, reasoning);
//        logger.info("FINISH! %d".formatted(System.currentTimeMillis()-startTime));
//    }
//}
//
//class ImageLLMTask extends LLMTask{
//    ImageLLMTask(String prev) throws NoEnvException {
//        super(prev);
//    }
//    @Override
//    public void run() {
//
//        try{
//            String imageResult = llm.sendPrompt(ModelCategory.FLUX, "%s is a description of the bass guitar. Please refer to this explanation to create a animal heavy metal band that hits the base. You must include animal music rock band".formatted(prev));
//        }
//        catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//abstract class LLMTask implements Runnable {
//    final LLM llm;
//
//    LLMTask() throws NoEnvException {
//        llm = new LLM();
//    }
//}
package llm;

import web_client.WebClient;

public class LLM extends WebClient implements ILLM {
    @Override
    public <T> T callAPI(LLMModel model){
        String path = "";

        switch (model.platform) {
            case GOOGLE -> {
                path = "https://generativelanguage.googleapis.com/v1beta/models/%s:%s".formatted(model.name, model.functions[0])"
            }
            case GROQ -> {
            }
            case TOGETHER_AI -> {
            }
        }
        sendRequest(makeRequest(path, method, body));
    }
}

/**
 * 다양한 LLM (Large Language Model) 플랫폼 및 모델에 대한 인터페이스를 제공합니다.
 */
interface ILLM {

    /**
     * 지원되는 LLM 플랫폼을 정의합니다.
     */
    enum LLMPlatform {
        /** Google의 Gemini 플랫폼 */
        GOOGLE,
        /** Groq 플랫폼 */
        GROQ,
        /** Together AI 플랫폼 */
        TOGETHER_AI
    }

    /**
     * 지원되는 LLM 모델 및 관련 정보를 정의합니다.
     */
    enum LLMModel {
        /** Google Gemini 2.0 Flash 모델 */
        GEMINI_2_0_FLASH(LLMPlatform.GOOGLE, "gemini-2.0-flash", "generateContent"),
        /** Groq Mixtral 8x7b 32768 모델 */
        MIXTRAL_8x7b_32768(LLMPlatform.GROQ, "mixtral-8x7b-32768"),
        /** Together AI Stable Diffusion XL Base 1.0 모델 */
        STABLE_DIFFUSION_XL_BASE_1_0(LLMPlatform.TOGETHER_AI, "stabilityai/stable-diffusion-xl-base-1.0");

        /** LLM 모델이 속한 플랫폼 */
        final public LLMPlatform platform;
        /** LLM 모델의 이름 */
        final public String name;
        /** LLM 모델에서 지원하는 기능 목록 */
        final public LLMAction action;

        /**
         * LLMModel 열거형 생성자
         *
         * @param platform  LLM 모델이 속한 플랫폼
         * @param name      LLM 모델의 이름
         * @param functions LLM 모델에서 지원하는 기능 목록 (선택 사항)
         */
        LLMModel(LLMPlatform platform, String name, LLM) {
            this.platform = platform;
            this.name = name;
            this.functions = functions;
        }

        enum LLMActions {
            GENERATE_CONTENT("generateContent");
            String name;

        }
    }

    /**
     * 지정된 LLM 모델의 API를 호출하고 결과를 반환합니다.
     *
     * @param model 호출할 LLM 모델
     * @param <T>   API 호출 결과의 타입 (String, Map, List, String[] 등)
     * @return API 호출 결과
     */
    <T> T callAPI(LLMModel model);
}
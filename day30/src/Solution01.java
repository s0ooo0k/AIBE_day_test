import llm.*;
import slack.Slack;

public class Solution01 {
    public static void main(String[] args) {
        LLM llm = new LLM();
        String result = llm.<String>callAPI(LLM.LLMModel.GEMINI_2_0_FLASH);
        Slack slack = new Slack();
    }
}
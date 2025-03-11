package org.example.servletreview.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@WebServlet("/gemini")
public class GeminiController extends Controller {
    @Override
    void initLogger() {
        logger = Logger.getLogger(GeminiController.class.getName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; application/json");

        var url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent";
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> bodyMap = new HashMap<>();

        // 쿼리 스트링에서 'prompt' 파라미터 값을 가져옴
        String prompt = req.getParameter("prompt");

        // 프롬프트가 null이거나 비어있으면 기본 프롬프트 사용
        if (prompt == null || prompt.trim().isEmpty()) {
            prompt = "부자 개발자가 되는 법";
        }

        Map<String, Object> textPart = new HashMap<>();
        textPart.put("text", prompt);

        List<Map<String, Object>> parts = List.of(textPart);

        Map<String, Object> content = new HashMap<>();
        content.put("parts", parts);

        List<Map<String, Object>> contents = List.of(content);

        bodyMap.put("contents", contents);

        String bodyString = mapper.writeValueAsString(bodyMap);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + "?key=" + dotenv.get("GEMINI_KEY")))
                .POST(HttpRequest.BodyPublishers.ofString(bodyString))
                .header("Content-Type", "application/json")
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            resp.setStatus(response.statusCode());
            PrintWriter out = resp.getWriter();
            out.println(response.body());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
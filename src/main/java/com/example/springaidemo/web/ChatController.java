package com.example.springaidemo.web;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DESKTOP-DKVSE2N
 * @date 2025/3/20 17:14
 */
@RestController
public class ChatController {

    @Autowired
    private OpenAiChatClient chatClient;

    @GetMapping("/chat1")
    public String demo(String msg){
        String call = chatClient.call(msg);
        return call;
    }

}

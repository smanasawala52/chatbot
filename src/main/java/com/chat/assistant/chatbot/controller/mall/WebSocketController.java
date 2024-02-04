package com.chat.assistant.chatbot.controller.mall;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chat.assistant.chatbot.model.Message;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) {
    	// // System.out.println("Reached here: " + message);
    	Message returnMessage = new Message("Admin", message.getContent());
        return returnMessage;
    }
}

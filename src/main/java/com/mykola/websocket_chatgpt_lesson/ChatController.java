package com.mykola.websocket_chatgpt_lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

//@Controller
//public class ChatController {
//
//    @MessageMapping("/chat")
//    @SendTo("/topic/messages")
//    public Message sendMessage(Message message) {
//        return message;
//    }
//}

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleMessage(Message message) {
        // Перевіряємо, чи є одержувач
        if (message.getTo() != null && !message.getTo().isEmpty()) {
            // Надсилаємо повідомлення конкретному користувачеві
            messagingTemplate.convertAndSendToUser(message.getTo(), "/queue/private", message);
        } else {
            // Якщо одержувача немає, відправляємо повідомлення на загальний канал
            messagingTemplate.convertAndSend("/topic/messages", message);
        }
    }

}

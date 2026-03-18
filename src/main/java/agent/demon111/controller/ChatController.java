package agent.demon111.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import agent.demon111.dto.ChatRequest;
import agent.demon111.dto.ChatResponse;
import agent.demon111.service.ChatService;


    @RestController
    @RequestMapping("/api/chat")
    public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }
    @PostMapping("/send")
    public ChatResponse send(@RequestBody ChatRequest request) {

        return chatService.chat(request);
    }
    @GetMapping("/history")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}

package agent.demon111.service;
import org.springframework.stereotype.Service;

import agent.demon111.dto.ChatRequest;
import agent.demon111.dto.ChatResponse;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public ChatResponse chat(ChatRequest request) {
        String message = request.getMessage();
        String responseMessage = "ai回复 " + message;
        return new ChatResponse(0,"success", responseMessage);
    }
}



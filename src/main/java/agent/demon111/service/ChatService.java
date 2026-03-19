package agent.demon111.service;
import java.util.List;

import org.springframework.stereotype.Service;

import agent.demon111.dto.ChatRequest;
import agent.demon111.dto.ChatResponse;

@Service
public interface ChatService {
    ChatResponse chat(ChatRequest request);
    List<ChatResponse> getChatHistory(Long userId);
}


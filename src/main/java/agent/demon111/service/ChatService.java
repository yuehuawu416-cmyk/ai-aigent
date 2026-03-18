package agent.demon111.service;
import org.springframework.stereotype.Service;

import agent.demon111.dto.ChatRequest;
import agent.demon111.dto.ChatResponse;

@Service
public interface ChatService {
    ChatResponse chat(ChatRequest request);
}

package agent.demon111.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import agent.demon111.dto.ChatRequest;
import agent.demon111.dto.ChatResponse;
import agent.demon111.entity.ChatMessage;
import agent.demon111.mapper.ChatMessageMapper;

@Service
public class ChatServiceImpl implements ChatService {

    private final ChatMessageMapper chatMessageMapper;

    public ChatServiceImpl(ChatMessageMapper chatMessageMapper){
        this.chatMessageMapper = chatMessageMapper;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        String message = request.getMessage();
        String responseMessage = "ai回复 " + message;

        // 1️⃣ 构造数据库对象
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage(message);
        chatMessage.setReply(responseMessage);
        chatMessage.setUserId(1L);
        chatMessage.setSentTime(LocalDateTime.now());

        // 2️⃣ 存数据库
        chatMessageMapper.insertChatMessage(chatMessage);

        // 3️⃣ 返回给前端
        return new ChatResponse(0, "success", responseMessage);
    }

    @Override
    public List<ChatResponse> getChatHistory(Long userId) {

        // 1️⃣ 从数据库拿数据（Entity）
        List<ChatMessage> list = chatMessageMapper.getChatMessages(userId);

        // 2️⃣ 转换成 DTO（关键！）
        List<ChatResponse> result = new ArrayList<>();

        for (ChatMessage msg : list) {
            result.add(new ChatResponse(
                    0,
                    "success",
                    msg.getMessage() + " | " + msg.getReply()
            ));
        }

        // 3️⃣ 返回给前端
        return result;
    }
}



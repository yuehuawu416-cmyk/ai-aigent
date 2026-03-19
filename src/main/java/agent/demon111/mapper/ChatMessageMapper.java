package agent.demon111.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import agent.demon111.entity.ChatMessage;
@Mapper
public interface ChatMessageMapper {

    @Insert("INSERT INTO chat_messages (message, reply, user_id, sent_time) " +
            "VALUES (#{message}, #{reply}, #{userId}, #{sentTime})")
    void insertChatMessage(ChatMessage chatMessage);

    @Select("SELECT * FROM chat_messages WHERE user_id = #{userId} ORDER BY sent_time DESC")
    List<ChatMessage> getChatMessages(@Param("userId") Long userId);
}

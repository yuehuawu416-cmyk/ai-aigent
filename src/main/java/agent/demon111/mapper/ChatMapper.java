package agent.demon111.mapper;
import agent.demon111.entity.ChatMessage;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface ChatMapper {
    void insert(ChatMessage chatMessage);
}

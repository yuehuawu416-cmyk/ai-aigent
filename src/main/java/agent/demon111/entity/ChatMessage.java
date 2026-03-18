package agent.demon111.entity;

public class ChatMessage {

    private Long id;
    private String message;
    private String reply;
    private Long userId;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getReply() { return reply; }
    public void setReply(String reply) { this.reply = reply; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
package tzb.pojo;

import lombok.Data;

@Data
public class Messages {

  private long messageId;
  private long senderId;
  private long receiverId;
  private String content;
  private java.sql.Timestamp createdAt;
  private long isRead;

}

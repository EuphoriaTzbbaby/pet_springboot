package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Notifications {

  private long notificationId;
  private long userId;
  private long otherId;
  private String type;
  private String content;
  private long isRead;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;

}

package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class AiChatLogs {

  private Integer chatId;
  private Integer userId;
  private String question;
  private String answer;
  private String modelUsed;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;
}

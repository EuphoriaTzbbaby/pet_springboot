package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class AdoptionApplications {

  private Integer applicationId;
  private Integer petId;
  private Integer userId;
  private String reason;
  private String livingCondition;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp updatedAt;

}

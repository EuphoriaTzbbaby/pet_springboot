package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Users {

  private Integer userId;
  private String username;
  private String password;
  private String email;
  private String phone;
  private String role;
  private String avatarUrl;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp updatedAt;
}

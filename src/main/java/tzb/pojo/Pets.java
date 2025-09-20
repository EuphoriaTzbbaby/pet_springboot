package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Pets {

  private Integer petId;
  private Integer orgId;
  private String name;
  private String species;
  private Integer age;
  private String gender;
  private String healthStatus;
  private Integer vaccinated;
  private String description;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp updatedAt;
}

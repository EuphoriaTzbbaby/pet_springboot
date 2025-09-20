package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class PetMedia {

  private Integer mediaId;
  private Integer petId;
  private String mediaType;
  private String url;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp uploadedAt;
}

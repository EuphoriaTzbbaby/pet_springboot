package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class PostMedia {

  private long mediaId;
  private long postId;
  private String mediaType;
  private String url;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp uploadedAt;

}

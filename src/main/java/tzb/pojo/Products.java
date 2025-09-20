package tzb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Products {

  private Integer productId;
  private Integer categoryId;
  private String name;
  private String description;
  private double price;
  private Integer stock;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp createdAt;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private java.sql.Timestamp updatedAt;
}

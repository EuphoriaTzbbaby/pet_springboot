package tzb.pojo;

import lombok.Data;

@Data
public class OrderItems {

  private Integer itemId;
  private Integer orderId;
  private Integer productId;
  private Integer quantity;
  private double price;
}

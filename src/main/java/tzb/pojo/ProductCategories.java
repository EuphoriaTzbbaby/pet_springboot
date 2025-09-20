package tzb.pojo;

import lombok.Data;

@Data
public class ProductCategories {

  private Integer categoryId;
  private String name;
  private Integer parentId;
}

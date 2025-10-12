package tzb.service;

import tzb.pojo.ProductImages;
import java.util.List;

public interface ProductImagesService {

    ProductImages getById(Integer id);

    List<ProductImages> getAll();

    boolean insert(ProductImages productImages);

    boolean update(ProductImages productImages);

    boolean delete(Integer id);
}

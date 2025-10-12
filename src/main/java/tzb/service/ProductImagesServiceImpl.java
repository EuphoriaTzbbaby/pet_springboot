package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.ProductImagesMapper;
import tzb.pojo.ProductImages;
import tzb.service.ProductImagesService;
import java.util.List;

@Service
public class ProductImagesServiceImpl implements ProductImagesService {

    @Autowired
    private ProductImagesMapper mapper;

    @Override
    public ProductImages getById(Integer id) {
        return mapper.getById(id);
    }

    @Override
    public List<ProductImages> getAll() {
        return mapper.getAll();
    }

    @Override
    public boolean insert(ProductImages productImages) {
        return mapper.insert(productImages) > 0;
    }

    @Override
    public boolean update(ProductImages productImages) {
        return mapper.update(productImages) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.delete(id) > 0;
    }
}

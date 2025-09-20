package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.ProductsMapper;
import tzb.pojo.Products;
import tzb.service.ProductsService;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsMapper productsMapper;

    @Override
    public int addProduct(Products product) {
        return productsMapper.insertProduct(product);
    }

    @Override
    public Products getProductById(Integer id) {
        return productsMapper.selectById(id);
    }

    @Override
    public List<Products> getAllProducts() {
        return productsMapper.selectAll();
    }

    @Override
    public List<Products> getProductsByCategory(Integer categoryId) {
        return productsMapper.selectByCategory(categoryId);
    }

    @Override
    public int updateProduct(Products product) {
        return productsMapper.updateProduct(product);
    }

    @Override
    public int updateStock(Integer id, Integer stock) {
        return productsMapper.updateStock(id, stock);
    }

    @Override
    public int updateStatus(Integer id, String status) {
        return productsMapper.updateStatus(id, status);
    }

    @Override
    public int deleteProduct(Integer id) {
        return productsMapper.deleteById(id);
    }

    @Override
    public int deleteProductsBatch(List<Integer> ids) {
        return productsMapper.deleteBatch(ids);
    }
}

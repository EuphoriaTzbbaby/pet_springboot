package tzb.service;

import tzb.pojo.Products;

import java.util.List;

public interface ProductsService {
    int addProduct(Products product);
    Products getProductById(Integer id);
    List<Products> getAllProducts();
    List<Products> getProductsByCategory(Integer categoryId);
    int updateProduct(Products product);
    int updateStock(Integer id, Integer stock);
    int updateStatus(Integer id, String status);
    int deleteProduct(Integer id);
    int deleteProductsBatch(List<Integer> ids);
}

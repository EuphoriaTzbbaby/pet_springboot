package tzb.controller.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Products;
import tzb.service.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsReadController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/{id}")
    public Products getById(@PathVariable Integer id) {
        return productsService.getProductById(id);
    }

    @GetMapping("/all")
    public List<Products> getAll() {
        return productsService.getAllProducts();
    }

    @GetMapping("/category/{categoryId}")
    public List<Products> getByCategory(@PathVariable Integer categoryId) {
        return productsService.getProductsByCategory(categoryId);
    }
}

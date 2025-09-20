package tzb.controller.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Products;
import tzb.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsCreateController {

    @Autowired
    private ProductsService productsService;

    @PostMapping("/create")
    public String create(@RequestBody Products product) {
        int res = productsService.addProduct(product);
        return res > 0 ? "Product created successfully" : "Failed to create product";
    }
}

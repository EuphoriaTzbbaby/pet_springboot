package tzb.controller.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Products;
import tzb.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsUpdateController {

    @Autowired
    private ProductsService productsService;

    @PutMapping("/update")
    public String update(@RequestBody Products product) {
        int res = productsService.updateProduct(product);
        return res > 0 ? "Product updated successfully" : "Failed to update product";
    }

    @PatchMapping("/stock/{id}")
    public String updateStock(@PathVariable Integer id, @RequestParam Integer stock) {
        int res = productsService.updateStock(id, stock);
        return res > 0 ? "Stock updated successfully" : "Failed to update stock";
    }

    @PatchMapping("/status/{id}")
    public String updateStatus(@PathVariable Integer id, @RequestParam String status) {
        int res = productsService.updateStatus(id, status);
        return res > 0 ? "Status updated successfully" : "Failed to update status";
    }
}

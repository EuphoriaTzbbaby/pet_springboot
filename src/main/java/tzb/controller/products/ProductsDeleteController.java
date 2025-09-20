package tzb.controller.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.ProductsService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsDeleteController {

    @Autowired
    private ProductsService productsService;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        int res = productsService.deleteProduct(id);
        return res > 0 ? "Product deleted successfully" : "Failed to delete product";
    }

    @DeleteMapping("/batch")
    public String deleteBatch(@RequestBody List<Integer> ids) {
        int res = productsService.deleteProductsBatch(ids);
        return res > 0 ? "Batch delete successful" : "Batch delete failed";
    }
}

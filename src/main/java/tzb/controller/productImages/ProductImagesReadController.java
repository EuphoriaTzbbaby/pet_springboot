package tzb.controller.productImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.ProductImages;
import tzb.service.ProductImagesService;
import java.util.List;

@RestController
@RequestMapping("/productImages")
public class ProductImagesReadController {

    @Autowired
    private ProductImagesService service;

    @GetMapping("/{id}")
    public ProductImages getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<ProductImages> getAll() {
        return service.getAll();
    }
}

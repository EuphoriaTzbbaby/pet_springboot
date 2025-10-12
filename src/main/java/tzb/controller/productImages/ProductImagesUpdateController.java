package tzb.controller.productImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.ProductImages;
import tzb.service.ProductImagesService;

@RestController
@RequestMapping("/productImages")
public class ProductImagesUpdateController {

    @Autowired
    private ProductImagesService service;

    @PutMapping
    public String update(@RequestBody ProductImages productImages) {
        return service.update(productImages) ? "更新成功" : "更新失败";
    }
}

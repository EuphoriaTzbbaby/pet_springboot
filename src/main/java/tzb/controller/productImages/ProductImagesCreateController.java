package tzb.controller.productImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.ProductImages;
import tzb.service.ProductImagesService;

@RestController
@RequestMapping("/productImages")
public class ProductImagesCreateController {

    @Autowired
    private ProductImagesService service;

    @PostMapping
    public String add(@RequestBody ProductImages productImages) {
        return service.insert(productImages) ? "添加成功" : "添加失败";
    }
}

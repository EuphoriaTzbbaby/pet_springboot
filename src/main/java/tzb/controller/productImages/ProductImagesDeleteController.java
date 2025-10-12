package tzb.controller.productImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.ProductImagesService;

@RestController
@RequestMapping("/productImages")
public class ProductImagesDeleteController {

    @Autowired
    private ProductImagesService service;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return service.delete(id) ? "删除成功" : "删除失败";
    }
}

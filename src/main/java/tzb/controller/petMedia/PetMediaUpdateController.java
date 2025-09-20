package tzb.controller.petMedia;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PetMedia;
import tzb.service.PetMediaService;


@RestController
@RequestMapping("/petMedia/update")
public class PetMediaUpdateController {

    @Resource
    private PetMediaService petMediaService;

    @PutMapping
    public String update(@RequestBody PetMedia petMedia) {
        boolean success = petMediaService.update(petMedia);
        return success ? "更新成功" : "更新失败";
    }
}

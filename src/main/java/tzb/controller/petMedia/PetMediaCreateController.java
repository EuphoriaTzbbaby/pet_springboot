package tzb.controller.petMedia;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PetMedia;
import tzb.service.PetMediaService;


@RestController
@RequestMapping("/petMedia/create")
public class PetMediaCreateController {

    @Resource
    private PetMediaService petMediaService;

    @PostMapping
    public String add(@RequestBody PetMedia petMedia) {
        boolean success = petMediaService.add(petMedia);
        return success ? "添加成功" : "添加失败";
    }
}

package tzb.controller.petMedia;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import tzb.service.PetMediaService;

@RestController
@RequestMapping("/petMedia/delete")
public class PetMediaDeleteController {

    @Resource
    private PetMediaService petMediaService;

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean success = petMediaService.deleteById(id);
        return success ? "删除成功" : "删除失败";
    }

    @DeleteMapping("/byPet/{petId}")
    public String deleteByPetId(@PathVariable("petId") Integer petId) {
        boolean success = petMediaService.deleteByPetId(petId);
        return success ? "删除该宠物的所有媒体成功" : "删除失败";
    }
}

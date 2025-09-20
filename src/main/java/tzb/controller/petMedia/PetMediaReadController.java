package tzb.controller.petMedia;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PetMedia;
import tzb.service.PetMediaService;
import java.util.List;

@RestController
@RequestMapping("/petMedia/read")
public class PetMediaReadController {

    @Resource
    private PetMediaService petMediaService;

    @GetMapping("/{id}")
    public PetMedia getById(@PathVariable("id") Integer id) {
        return petMediaService.getById(id);
    }

    @GetMapping("/byPet/{petId}")
    public List<PetMedia> getByPetId(@PathVariable("petId") Integer petId) {
        return petMediaService.getByPetId(petId);
    }

    @GetMapping("/all")
    public List<PetMedia> getAll() {
        return petMediaService.getAll();
    }

    @GetMapping("/count/{petId}")
    public int countByPetId(@PathVariable("petId") Integer petId) {
        return petMediaService.countByPetId(petId);
    }
}

package tzb.controller.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Pets;
import tzb.service.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsUpdateController {

    @Autowired
    private PetsService petsService;

    @PutMapping("/update")
    public int update(@RequestBody Pets pet) {
        return petsService.update(pet);
    }
}
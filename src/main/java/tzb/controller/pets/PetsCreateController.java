package tzb.controller.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Pets;
import tzb.service.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsCreateController {

    @Autowired
    private PetsService petsService;

    @PostMapping
    public int create(@RequestBody Pets pet) {
        System.out.println(pet.toString());
        int v = petsService.create(pet);
        if(v > 0) {
            return petsService.findAll().size();
        } else {
            return -1;
        }
    }
}
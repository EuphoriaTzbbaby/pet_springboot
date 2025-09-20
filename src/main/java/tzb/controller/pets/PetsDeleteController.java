package tzb.controller.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.PetsService;

@RestController
@RequestMapping("/pets")
public class PetsDeleteController {

    @Autowired
    private PetsService petsService;

    @DeleteMapping("/{petId}")
    public int delete(@PathVariable Integer petId) {
        return petsService.delete(petId);
    }
}
package tzb.controller.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Pets;
import tzb.service.PetsService;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsReadController {

    @Autowired
    private PetsService petsService;

    @GetMapping("/{petId}")
    public Pets getById(@PathVariable Integer petId) {
        return petsService.findById(petId);
    }

    @GetMapping
    public List<Pets> getAll() {
        return petsService.findAll();
    }
}
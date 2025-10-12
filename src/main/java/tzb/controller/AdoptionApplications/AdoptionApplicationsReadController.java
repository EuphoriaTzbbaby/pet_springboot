package tzb.controller.AdoptionApplications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionApplications;
import tzb.service.AdoptionApplicationsService;

import java.util.List;

@RestController
@RequestMapping("/adoptions")
public class AdoptionApplicationsReadController {

    @Autowired
    private AdoptionApplicationsService service;

    @GetMapping("/{id}")
    public AdoptionApplications getById(@PathVariable Integer id) {
        return service.getApplicationById(id);
    }

    @GetMapping
    public List<AdoptionApplications> getAll() {
        return service.getAllApplications();
    }

    @GetMapping("/user/{userId}")
    public List<AdoptionApplications> getByUser(@PathVariable Integer userId) {
        return service.getApplicationsByUserId(userId);
    }

    @GetMapping("/pet/{petId}")
    public List<AdoptionApplications> getByPet(@PathVariable Integer petId) {
        return service.getApplicationsByPetId(petId);
    }

    @GetMapping("/count/{status}")
    public int countByStatus(@PathVariable String status) {
        return service.countByStatus(status);
    }
}

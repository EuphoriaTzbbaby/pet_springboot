package tzb.controller.AdoptionContracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionContracts;
import tzb.service.AdoptionContractsService;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class AdoptionContractsReadController {

    @Autowired
    private AdoptionContractsService service;

    @GetMapping("/{id}")
    public AdoptionContracts getById(@PathVariable Integer id) {
        return service.getContractById(id);
    }

    @GetMapping("/application/{applicationId}")
    public AdoptionContracts getByApplicationId(@PathVariable Integer applicationId) {
        return service.getContractByApplicationId(applicationId);
    }

    @GetMapping
    public List<AdoptionContracts> getAll() {
        return service.getAllContracts();
    }

    @GetMapping("/count/signed")
    public int countSigned() {
        return service.countSigned();
    }
}

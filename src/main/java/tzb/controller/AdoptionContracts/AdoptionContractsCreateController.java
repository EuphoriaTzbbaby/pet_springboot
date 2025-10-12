package tzb.controller.AdoptionContracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionContracts;
import tzb.service.AdoptionContractsService;

@RestController
@RequestMapping("/contracts")
public class AdoptionContractsCreateController {

    @Autowired
    private AdoptionContractsService service;

    @PostMapping
    public String create(@RequestBody AdoptionContracts contract) {
        int result = service.createContract(contract);
        return result > 0 ? "合同创建成功" : "合同创建失败";
    }
}

package tzb.controller.AdoptionContracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionContracts;
import tzb.service.AdoptionContractsService;

@RestController
@RequestMapping("/contracts")
public class AdoptionContractsUpdateController {

    @Autowired
    private AdoptionContractsService service;

    @PutMapping
    public String update(@RequestBody AdoptionContracts contract) {
        int result = service.updateContract(contract);
        return result > 0 ? "合同更新成功" : "合同更新失败";
    }
}

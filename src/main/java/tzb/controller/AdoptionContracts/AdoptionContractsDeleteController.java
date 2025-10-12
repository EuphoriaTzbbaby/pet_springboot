package tzb.controller.AdoptionContracts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.AdoptionContractsService;

@RestController
@RequestMapping("/contracts")
public class AdoptionContractsDeleteController {

    @Autowired
    private AdoptionContractsService service;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        int result = service.deleteContract(id);
        return result > 0 ? "合同删除成功" : "合同删除失败";
    }
}

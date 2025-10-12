package tzb.controller.AdoptionApplications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.AdoptionApplicationsService;

@RestController
@RequestMapping("/adoptions")
public class AdoptionApplicationsDeleteController {

    @Autowired
    private AdoptionApplicationsService service;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        int result = service.deleteApplication(id);
        return result > 0 ? "删除成功" : "删除失败";
    }
}

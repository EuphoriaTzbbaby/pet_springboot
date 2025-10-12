package tzb.controller.AdoptionApplications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionApplications;
import tzb.service.AdoptionApplicationsService;

@RestController
@RequestMapping("/adoptions")
public class AdoptionApplicationsUpdateController {

    @Autowired
    private AdoptionApplicationsService service;

    @PutMapping
    public String update(@RequestBody AdoptionApplications app) {
        int result = service.updateApplication(app);
        return result > 0 ? "更新成功" : "更新失败";
    }
}

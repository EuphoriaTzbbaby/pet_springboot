package tzb.controller.AdoptionApplications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.AdoptionApplications;
import tzb.service.AdoptionApplicationsService;

@RestController
@RequestMapping("/adoptions")
public class AdoptionApplicationsCreateController {

    @Autowired
    private AdoptionApplicationsService service;

    @PostMapping
    public String create(@RequestBody AdoptionApplications app) {
        int result = service.createApplication(app);
        return result > 0 ? "申请提交成功" : "申请提交失败";
    }
}

package tzb.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Users;
import tzb.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersCreateController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public String create(@RequestBody Users user) {
        return usersService.insert(user) > 0 ? "success" : "fail";
    }
}

package tzb.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Users;
import tzb.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersUpdateController {

    @Autowired
    private UsersService usersService;

    @PutMapping
    public String update(@RequestBody Users user) {
        return usersService.update(user) > 0 ? "success" : "fail";
    }

}

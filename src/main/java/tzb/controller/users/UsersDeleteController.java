package tzb.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersDeleteController {

    @Autowired
    private UsersService usersService;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return usersService.delete(id) > 0 ? "success" : "fail";
    }
}

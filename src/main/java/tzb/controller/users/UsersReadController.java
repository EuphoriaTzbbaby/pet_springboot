package tzb.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Users;
import tzb.service.UsersService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UsersReadController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public Users getById(@PathVariable Integer id) {
        return usersService.getById(id);
    }

    @GetMapping
    public List<Users> getAll() {
        return usersService.getAll();
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Users users) {
        Users loginUser = usersService.login(users.getEmail(), users.getPassword());

        Map<String, Object> result = new HashMap<>();
        if (loginUser != null) {
            result.put("code", 200);
            result.put("msg", "登录成功");
            result.put("data", loginUser);
        } else {
            result.put("code", 401);
            result.put("msg", "用户名或密码错误");
        }
        return result;
    }
}

package tzb.service;

import tzb.pojo.Users;
import java.util.List;

public interface UsersService {
    Users getById(Integer id);
    List<Users> getAll();
    int insert(Users user);
    int update(Users user);
    int delete(Integer id);
    Users login(String email, String password);

}

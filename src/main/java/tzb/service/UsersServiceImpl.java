package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.UsersMapper;
import tzb.pojo.Users;
import tzb.service.UsersService;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users getById(Integer id) {
        return usersMapper.getById(id);
    }

    @Override
    public List<Users> getAll() {
        return usersMapper.getAll();
    }

    @Override
    public Users login(String email, String password) {
        return usersMapper.login(email, password);
    }

    @Override
    public int insert(Users user) {
        return usersMapper.insert(user);
    }

    @Override
    public int update(Users user) {
        return usersMapper.update(user);
    }

    @Override
    public int delete(Integer id) {
        return usersMapper.delete(id);
    }
}

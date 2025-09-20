package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Users;
import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM users WHERE user_id = #{id}")
    Users getById(Integer id);

    @Select("SELECT * FROM users")
    List<Users> getAll();

    @Select("SELECT * FROM users WHERE email = #{email} AND password = #{password} LIMIT 1")
    Users login(@Param("email") String email, @Param("password") String password);

    @Insert("INSERT INTO users(username,password,email,phone,role,avatar_url,status,created_at,updated_at) " +
            "VALUES(#{username},#{password},#{email},#{phone},#{role},#{avatarUrl},#{status},#{createdAt},#{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    int insert(Users user);

    @Update("UPDATE users SET username=#{username},password=#{password},email=#{email},phone=#{phone},role=#{role},avatar_url=#{avatarUrl},status=#{status},updated_at=#{updatedAt} WHERE user_id=#{userId}")
    int update(Users user);

    @Delete("DELETE FROM users WHERE user_id=#{id}")
    int delete(Integer id);
}

package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.AdoptionApplications;

import java.util.List;

@Mapper
public interface AdoptionApplicationsMapper {

    // 插入
    @Insert("INSERT INTO adoption_applications (pet_id, user_id, reason, living_condition, status, created_at, updated_at) " +
            "VALUES (#{petId}, #{userId}, #{reason}, #{livingCondition}, #{status}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "applicationId")
    int insert(AdoptionApplications app);

    // 根据 ID 查询
    @Select("SELECT * FROM adoption_applications WHERE application_id = #{id}")
    AdoptionApplications selectById(Integer id);

    // 查询所有
    @Select("SELECT * FROM adoption_applications ORDER BY created_at DESC")
    List<AdoptionApplications> selectAll();

    // 根据用户 ID 查询
    @Select("SELECT * FROM adoption_applications WHERE user_id = #{userId} ORDER BY created_at DESC")
    List<AdoptionApplications> selectByUserId(Integer userId);

    // 根据宠物 ID 查询
    @Select("SELECT * FROM adoption_applications WHERE pet_id = #{petId}")
    List<AdoptionApplications> selectByPetId(Integer petId);

    // 更新
    @Update("UPDATE adoption_applications SET reason=#{reason}, living_condition=#{livingCondition}, status=#{status}, updated_at=#{updatedAt} " +
            "WHERE application_id=#{applicationId}")
    int update(AdoptionApplications app);

    // 删除
    @Delete("DELETE FROM adoption_applications WHERE application_id=#{id}")
    int delete(Integer id);

    // 按状态统计
    @Select("SELECT COUNT(*) FROM adoption_applications WHERE status = #{status}")
    int countByStatus(String status);
}

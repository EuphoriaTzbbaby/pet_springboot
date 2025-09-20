package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Pets;

import java.util.List;

@Mapper
public interface PetsMapper {

    @Insert("INSERT INTO pets (org_id, name, species, age, gender, health_status, vaccinated, description, status, created_at, updated_at) " +
            "VALUES (#{orgId}, #{name}, #{species}, #{age}, #{gender}, #{healthStatus}, #{vaccinated}, #{description}, #{status}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "petId")
    int insert(Pets pet);

    @Update("UPDATE pets SET org_id = #{orgId}, name = #{name}, species = #{species}, age = #{age}, gender = #{gender}, " +
            "health_status = #{healthStatus}, vaccinated = #{vaccinated}, description = #{description}, status = #{status}, " +
            "updated_at = #{updatedAt} WHERE pet_id = #{petId}")
    int update(Pets pet);

    @Delete("DELETE FROM pets WHERE pet_id = #{petId}")
    int delete(@Param("petId") Integer petId);

    @Select("SELECT * FROM pets WHERE pet_id = #{petId}")
    Pets findById(@Param("petId") Integer petId);

    @Select("SELECT * FROM pets")
    List<Pets> findAll();
}
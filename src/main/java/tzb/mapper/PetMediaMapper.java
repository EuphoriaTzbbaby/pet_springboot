package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.PetMedia;

import java.util.List;

@Mapper
public interface PetMediaMapper {

    @Select("SELECT * FROM pet_media WHERE media_id = #{mediaId}")
    PetMedia selectById(Integer mediaId);

    @Select("SELECT * FROM pet_media WHERE pet_id = #{petId}")
    List<PetMedia> selectByPetId(Integer petId);

    @Select("SELECT * FROM pet_media")
    List<PetMedia> selectAll();

    @Insert("INSERT INTO pet_media(pet_id, media_type, url, uploaded_at) " +
            "VALUES(#{petId}, #{mediaType}, #{url}, #{uploadedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "mediaId")
    int insert(PetMedia petMedia);

    @Update("UPDATE pet_media SET pet_id=#{petId}, media_type=#{mediaType}, url=#{url}, uploaded_at=#{uploadedAt} " +
            "WHERE media_id=#{mediaId}")
    int update(PetMedia petMedia);

    @Delete("DELETE FROM pet_media WHERE media_id=#{mediaId}")
    int deleteById(Integer mediaId);

    @Delete("DELETE FROM pet_media WHERE pet_id=#{petId}")
    int deleteByPetId(Integer petId);

    @Select("SELECT COUNT(*) FROM pet_media WHERE pet_id = #{petId}")
    int countByPetId(Integer petId);
}

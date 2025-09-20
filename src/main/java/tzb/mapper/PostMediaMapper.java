package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.PostMedia;

import java.util.List;

@Mapper
public interface PostMediaMapper {

    @Insert("INSERT INTO post_media(post_id, media_type, url, uploaded_at) " +
            "VALUES(#{postId}, #{mediaType}, #{url}, #{uploadedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "mediaId")
    int insert(PostMedia postMedia);

    @Select("SELECT * FROM post_media WHERE media_id = #{mediaId}")
    PostMedia selectById(long mediaId);

    @Select("SELECT * FROM post_media WHERE post_id = #{postId}")
    List<PostMedia> selectByPostId(long postId);

    @Select("SELECT * FROM post_media")
    List<PostMedia> selectAll();

    @Update("UPDATE post_media SET post_id=#{postId}, media_type=#{mediaType}, url=#{url}, uploaded_at=#{uploadedAt} " +
            "WHERE media_id=#{mediaId}")
    int update(PostMedia postMedia);

    @Delete("DELETE FROM post_media WHERE media_id=#{mediaId}")
    int delete(long mediaId);
}

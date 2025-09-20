package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Likes;

import java.util.List;

@Mapper
public interface LikesMapper {

    @Insert("INSERT INTO likes(post_id, user_id, created_at) " +
            "VALUES(#{postId}, #{userId}, #{createdAt})")
    @Options(useGeneratedKeys = true, keyProperty = "likeId")
    int insert(Likes likes);

    @Select("SELECT * FROM likes WHERE like_id = #{likeId}")
    Likes selectById(long likeId);

    @Select("SELECT * FROM likes WHERE post_id = #{postId}")
    List<Likes> selectByPostId(long postId);

    @Select("SELECT * FROM likes WHERE user_id = #{userId}")
    List<Likes> selectByUserId(long userId);

    @Select("SELECT * FROM likes")
    List<Likes> selectAll();

    @Delete("DELETE FROM likes WHERE like_id = #{likeId}")
    int delete(long likeId);

    @Delete("DELETE FROM likes WHERE post_id = #{postId} AND user_id = #{userId}")
    int deleteByPostAndUser(@Param("postId") long postId, @Param("userId") long userId);
}

package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Posts;

import java.util.List;

@Mapper
public interface PostsMapper {

    @Insert("INSERT INTO posts (user_id, title, content, created_at, updated_at, tags) " +
            "VALUES (#{userId}, #{title}, #{content}, #{createdAt}, #{updatedAt}, #{tags})")
    @Options(useGeneratedKeys = true, keyProperty = "postId")
    int insert(Posts post);

    @Select("SELECT * FROM posts WHERE post_id = #{id}")
    Posts selectById(long id);

    @Select("SELECT * FROM posts ORDER BY created_at DESC")
    List<Posts> selectAll();

    @Update("UPDATE posts SET title=#{title}, content=#{content}, updated_at=#{updatedAt} WHERE post_id=#{postId}")
    int update(Posts post);

    @Delete("DELETE FROM posts WHERE post_id = #{id}")
    int deleteById(long id);

    @Delete("<script>" +
            "DELETE FROM posts WHERE post_id IN " +
            "<foreach collection='ids' item='id' open='(' separator=',' close=')'>" +
            "#{id}" +
            "</foreach>" +
            "</script>")
    int deleteBatch(@Param("ids") List<Long> ids);
}

package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Comments;

import java.util.List;

@Mapper
public interface CommentsMapper {

    @Insert("INSERT INTO comments(post_id, user_id, parent_id, reply_to_user_id, content, created_at, updated_at) " +
            "VALUES(#{postId}, #{userId}, #{parentId}, #{replyToUserId}, #{content}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "commentId")
    int insert(Comments comments);

    @Select("SELECT * FROM comments WHERE comment_id = #{commentId}")
    Comments selectById(long commentId);

    @Select("SELECT * FROM comments WHERE post_id = #{postId}")
    List<Comments> selectByPostId(long postId);

    @Select("SELECT * FROM comments WHERE parent_id = #{parentId}")
    List<Comments> selectByParentId(long parentId);

    @Select("SELECT * FROM comments")
    List<Comments> selectAll();

    @Update("UPDATE comments SET post_id=#{postId}, user_id=#{userId}, parent_id=#{parentId}, reply_to_user_id=#{replyToUserId} " +
            "content=#{content}, created_at=#{createdAt}, updated_at=#{updatedAt} WHERE comment_id=#{commentId}")
    int update(Comments comments);

    @Delete("DELETE FROM comments WHERE comment_id = #{commentId}")
    int delete(long commentId);
}

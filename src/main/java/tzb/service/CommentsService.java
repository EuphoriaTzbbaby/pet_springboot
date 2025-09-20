package tzb.service;

import tzb.pojo.Comments;
import java.util.List;

public interface CommentsService {
    int create(Comments comments);
    Comments getById(long commentId);
    List<Comments> getByPostId(long postId);
    List<Comments> getByParentId(long parentId);
    List<Comments> getAll();
    int update(Comments comments);
    int delete(long commentId);
}

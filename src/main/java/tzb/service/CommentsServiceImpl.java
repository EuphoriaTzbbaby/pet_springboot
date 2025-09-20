package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.CommentsMapper;
import tzb.pojo.Comments;
import tzb.service.CommentsService;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsMapper commentsMapper;

    @Override
    public int create(Comments comments) {
        return commentsMapper.insert(comments);
    }

    @Override
    public Comments getById(long commentId) {
        return commentsMapper.selectById(commentId);
    }

    @Override
    public List<Comments> getByPostId(long postId) {
        return commentsMapper.selectByPostId(postId);
    }

    @Override
    public List<Comments> getByParentId(long parentId) {
        return commentsMapper.selectByParentId(parentId);
    }

    @Override
    public List<Comments> getAll() {
        return commentsMapper.selectAll();
    }

    @Override
    public int update(Comments comments) {
        return commentsMapper.update(comments);
    }

    @Override
    public int delete(long commentId) {
        return commentsMapper.delete(commentId);
    }
}

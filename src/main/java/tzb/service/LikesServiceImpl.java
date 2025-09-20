package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.LikesMapper;
import tzb.pojo.Likes;
import tzb.service.LikesService;

import java.util.List;

@Service
public class LikesServiceImpl implements LikesService {

    @Autowired
    private LikesMapper likesMapper;

    @Override
    public int create(Likes likes) {
        return likesMapper.insert(likes);
    }

    @Override
    public Likes getById(long likeId) {
        return likesMapper.selectById(likeId);
    }

    @Override
    public List<Likes> getByPostId(long postId) {
        return likesMapper.selectByPostId(postId);
    }

    @Override
    public List<Likes> getByUserId(long userId) {
        return likesMapper.selectByUserId(userId);
    }

    @Override
    public List<Likes> getAll() {
        return likesMapper.selectAll();
    }

    @Override
    public int delete(long likeId) {
        return likesMapper.delete(likeId);
    }

    @Override
    public int deleteByPostAndUser(long postId, long userId) {
        return likesMapper.deleteByPostAndUser(postId, userId);
    }
}

package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.PostMediaMapper;
import tzb.pojo.PostMedia;
import tzb.service.PostMediaService;

import java.util.List;

@Service
public class PostMediaServiceImpl implements PostMediaService {

    @Autowired
    private PostMediaMapper postMediaMapper;

    @Override
    public int create(PostMedia postMedia) {
        return postMediaMapper.insert(postMedia);
    }

    @Override
    public PostMedia getById(long mediaId) {
        return postMediaMapper.selectById(mediaId);
    }

    @Override
    public List<PostMedia> getByPostId(long postId) {
        return postMediaMapper.selectByPostId(postId);
    }

    @Override
    public List<PostMedia> getAll() {
        return postMediaMapper.selectAll();
    }

    @Override
    public int update(PostMedia postMedia) {
        return postMediaMapper.update(postMedia);
    }

    @Override
    public int delete(long mediaId) {
        return postMediaMapper.delete(mediaId);
    }
}

package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.PostsMapper;
import tzb.pojo.Posts;
import tzb.service.PostsService;

import java.util.List;

@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsMapper postsMapper;

    @Override
    public int createPost(Posts post) {
        return postsMapper.insert(post);
    }

    @Override
    public Posts getPostById(long id) {
        return postsMapper.selectById(id);
    }

    @Override
    public List<Posts> getAllPosts() {
        return postsMapper.selectAll();
    }

    @Override
    public int updatePost(Posts post) {
        return postsMapper.update(post);
    }

    @Override
    public int deletePost(long id) {
        return postsMapper.deleteById(id);
    }

    @Override
    public int deletePostsBatch(List<Long> ids) {
        return postsMapper.deleteBatch(ids);
    }
}

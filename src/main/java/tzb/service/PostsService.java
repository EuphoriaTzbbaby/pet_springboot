package tzb.service;

import tzb.pojo.Posts;

import java.util.List;

public interface PostsService {

    int createPost(Posts post);

    Posts getPostById(long id);

    List<Posts> getAllPosts();

    int updatePost(Posts post);

    int deletePost(long id);

    int deletePostsBatch(List<Long> ids);
}

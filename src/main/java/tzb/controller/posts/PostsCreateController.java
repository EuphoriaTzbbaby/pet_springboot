package tzb.controller.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Posts;
import tzb.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsCreateController {

    @Autowired
    private PostsService postsService;

    @PostMapping
    public String createPost(@RequestBody Posts post) {
        int rows = postsService.createPost(post);
        return rows > 0 ? "Post created successfully" : "Failed to create post";
    }
}

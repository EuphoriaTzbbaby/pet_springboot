package tzb.controller.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Posts;
import tzb.service.PostsService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsReadController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/{id}")
    public Posts getPostById(@PathVariable long id) {
        return postsService.getPostById(id);
    }

    @GetMapping
    public List<Posts> getAllPosts() {
        return postsService.getAllPosts();
    }
}

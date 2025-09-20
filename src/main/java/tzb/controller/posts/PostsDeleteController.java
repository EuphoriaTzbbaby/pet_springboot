package tzb.controller.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.PostsService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsDeleteController {

    @Autowired
    private PostsService postsService;

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable long id) {
        int rows = postsService.deletePost(id);
        return rows > 0 ? "Post deleted successfully" : "Failed to delete post";
    }

    @DeleteMapping("/batch")
    public String deletePostsBatch(@RequestBody List<Long> ids) {
        int rows = postsService.deletePostsBatch(ids);
        return rows > 0 ? "Batch delete successful" : "Failed to delete posts";
    }
}

package tzb.controller.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Posts;
import tzb.service.PostsService;

@RestController
@RequestMapping("/posts")
public class PostsUpdateController {

    @Autowired
    private PostsService postsService;

    @PutMapping("/{id}")
    public String updatePost(@PathVariable long id, @RequestBody Posts post) {
        post.setPostId(id);
        int rows = postsService.updatePost(post);
        return rows > 0 ? "Post updated successfully" : "Failed to update post";
    }
}

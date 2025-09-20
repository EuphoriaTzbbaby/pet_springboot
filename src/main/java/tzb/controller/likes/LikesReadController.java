package tzb.controller.likes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Likes;
import tzb.service.LikesService;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikesReadController {

    @Autowired
    private LikesService likesService;

    @GetMapping("/{likeId}")
    public Likes getById(@PathVariable long likeId) {
        return likesService.getById(likeId);
    }

    @GetMapping("/post/{postId}")
    public List<Likes> getByPostId(@PathVariable long postId) {
        return likesService.getByPostId(postId);
    }

    @GetMapping("/user/{userId}")
    public List<Likes> getByUserId(@PathVariable long userId) {
        return likesService.getByUserId(userId);
    }

    @GetMapping
    public List<Likes> getAll() {
        return likesService.getAll();
    }
}

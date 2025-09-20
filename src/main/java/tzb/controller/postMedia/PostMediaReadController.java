package tzb.controller.postMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PostMedia;
import tzb.service.PostMediaService;

import java.util.List;

@RestController
@RequestMapping("/postMedia")
public class PostMediaReadController {

    @Autowired
    private PostMediaService postMediaService;

    @GetMapping("/{mediaId}")
    public PostMedia getById(@PathVariable long mediaId) {
        return postMediaService.getById(mediaId);
    }

    @GetMapping("/post/{postId}")
    public List<PostMedia> getByPostId(@PathVariable long postId) {
        return postMediaService.getByPostId(postId);
    }

    @GetMapping
    public List<PostMedia> getAll() {
        return postMediaService.getAll();
    }
}

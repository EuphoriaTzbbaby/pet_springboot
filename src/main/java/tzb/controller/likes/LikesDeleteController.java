package tzb.controller.likes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.LikesService;

@RestController
@RequestMapping("/likes")
public class LikesDeleteController {

    @Autowired
    private LikesService likesService;

    @DeleteMapping("/{likeId}")
    public String delete(@PathVariable long likeId) {
        return likesService.delete(likeId) > 0 ? "success" : "fail";
    }

    @DeleteMapping("/post/{postId}/user/{userId}")
    public String deleteByPostAndUser(@PathVariable long postId, @PathVariable long userId) {
        return likesService.deleteByPostAndUser(postId, userId) > 0 ? "success" : "fail";
    }
}

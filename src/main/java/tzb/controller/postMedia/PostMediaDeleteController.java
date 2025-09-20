package tzb.controller.postMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.PostMediaService;

@RestController
@RequestMapping("/postMedia")
public class PostMediaDeleteController {

    @Autowired
    private PostMediaService postMediaService;

    @DeleteMapping("/{mediaId}")
    public String delete(@PathVariable long mediaId) {
        int result = postMediaService.delete(mediaId);
        return result > 0 ? "success" : "fail";
    }
}

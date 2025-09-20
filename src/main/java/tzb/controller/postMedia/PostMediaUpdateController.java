package tzb.controller.postMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PostMedia;
import tzb.service.PostMediaService;

@RestController
@RequestMapping("/postMedia")
public class PostMediaUpdateController {

    @Autowired
    private PostMediaService postMediaService;

    @PutMapping("/update")
    public String update(@RequestBody PostMedia postMedia) {
        int result = postMediaService.update(postMedia);
        return result > 0 ? "success" : "fail";
    }
}

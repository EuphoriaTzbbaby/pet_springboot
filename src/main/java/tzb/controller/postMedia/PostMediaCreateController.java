package tzb.controller.postMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.PostMedia;
import tzb.service.PostMediaService;

@RestController
@RequestMapping("/postMedia")
public class PostMediaCreateController {

    @Autowired
    private PostMediaService postMediaService;

    @PostMapping
    public String create(@RequestBody PostMedia postMedia) {
        System.out.println(postMedia);
        int result = postMediaService.create(postMedia);
        return result > 0 ? "success" : "fail";
    }
}

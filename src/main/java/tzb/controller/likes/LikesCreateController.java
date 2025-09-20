package tzb.controller.likes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Likes;
import tzb.service.LikesService;

@RestController
@RequestMapping("/likes")
public class LikesCreateController {

    @Autowired
    private LikesService likesService;

    @PostMapping
    public String create(@RequestBody Likes likes) {
        return likesService.create(likes) > 0 ? "success" : "fail";
    }
}

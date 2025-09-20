package tzb.controller.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Comments;
import tzb.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsCreateController {

    @Autowired
    private CommentsService commentsService;

    @PostMapping
    public String create(@RequestBody Comments comments) {
        return commentsService.create(comments) > 0 ? "success" : "fail";
    }
}

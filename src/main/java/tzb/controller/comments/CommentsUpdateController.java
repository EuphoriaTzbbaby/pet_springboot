package tzb.controller.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Comments;
import tzb.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsUpdateController {

    @Autowired
    private CommentsService commentsService;

    @PutMapping("/update")
    public String update(@RequestBody Comments comments) {
        return commentsService.update(comments) > 0 ? "success" : "fail";
    }
}

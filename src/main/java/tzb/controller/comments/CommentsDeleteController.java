package tzb.controller.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsDeleteController {

    @Autowired
    private CommentsService commentsService;

    @DeleteMapping("/{commentId}")
    public String delete(@PathVariable long commentId) {
        return commentsService.delete(commentId) > 0 ? "success" : "fail";
    }
}

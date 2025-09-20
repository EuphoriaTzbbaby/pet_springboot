package tzb.controller.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Comments;
import tzb.service.CommentsService;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsReadController {

    @Autowired
    private CommentsService commentsService;

    @GetMapping("/{commentId}")
    public Comments getById(@PathVariable long commentId) {
        return commentsService.getById(commentId);
    }

    @GetMapping("/post/{postId}")
    public List<Comments> getByPostId(@PathVariable long postId) {
        return commentsService.getByPostId(postId);
    }

    @GetMapping("/parent/{parentId}")
    public List<Comments> getByParentId(@PathVariable long parentId) {
        return commentsService.getByParentId(parentId);
    }

    @GetMapping
    public List<Comments> getAll() {
        return commentsService.getAll();
    }
}

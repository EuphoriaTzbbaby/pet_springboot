package tzb.service;

import tzb.pojo.Likes;
import java.util.List;

public interface LikesService {
    int create(Likes likes);
    Likes getById(long likeId);
    List<Likes> getByPostId(long postId);
    List<Likes> getByUserId(long userId);
    List<Likes> getAll();
    int delete(long likeId);
    int deleteByPostAndUser(long postId, long userId);
}

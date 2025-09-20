package tzb.service;

import tzb.pojo.PostMedia;
import java.util.List;

public interface PostMediaService {
    int create(PostMedia postMedia);
    PostMedia getById(long mediaId);
    List<PostMedia> getByPostId(long postId);
    List<PostMedia> getAll();
    int update(PostMedia postMedia);
    int delete(long mediaId);
}

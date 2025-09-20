package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Notifications;
import java.util.List;

@Mapper
public interface NotificationsMapper {

    @Insert("INSERT INTO notifications(user_id, other_id, type, content, is_read, created_at) " +
            "VALUES(#{userId}, #{otherId}, #{type}, #{content}, #{isRead}, #{createdAt})")
    @Options(useGeneratedKeys = true, keyProperty = "notificationId")
    int insert(Notifications notification);

    @Select("SELECT * FROM notifications WHERE notification_id = #{id}")
    Notifications selectById(long id);

    @Select("SELECT * FROM notifications")
    List<Notifications> selectAll();

    @Update("UPDATE notifications SET user_id=#{userId}, other_id=#{otherId}type=#{type}, content=#{content}, " +
            "is_read=#{isRead}, created_at=#{createdAt} WHERE notification_id=#{notificationId}")
    int update(Notifications notification);

    @Delete("DELETE FROM notifications WHERE notification_id=#{id}")
    int delete(long id);
}

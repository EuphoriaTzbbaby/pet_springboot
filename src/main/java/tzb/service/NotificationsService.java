package tzb.service;

import tzb.pojo.Notifications;
import java.util.List;

public interface NotificationsService {
    int createNotification(Notifications notification);
    Notifications getNotificationById(long id);
    List<Notifications> getAllNotifications();
    int updateNotification(Notifications notification);
    int deleteNotification(long id);
}

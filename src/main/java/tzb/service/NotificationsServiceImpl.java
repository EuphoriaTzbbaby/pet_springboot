package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.NotificationsMapper;
import tzb.pojo.Notifications;
import tzb.service.NotificationsService;

import java.util.List;

@Service
public class NotificationsServiceImpl implements NotificationsService {

    @Autowired
    private NotificationsMapper notificationsMapper;

    @Override
    public int createNotification(Notifications notification) {
        return notificationsMapper.insert(notification);
    }

    @Override
    public Notifications getNotificationById(long id) {
        return notificationsMapper.selectById(id);
    }

    @Override
    public List<Notifications> getAllNotifications() {
        return notificationsMapper.selectAll();
    }

    @Override
    public int updateNotification(Notifications notification) {
        return notificationsMapper.update(notification);
    }

    @Override
    public int deleteNotification(long id) {
        return notificationsMapper.delete(id);
    }
}

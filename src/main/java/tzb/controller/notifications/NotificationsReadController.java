package tzb.controller.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Notifications;
import tzb.service.NotificationsService;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationsReadController {

    @Autowired
    private NotificationsService notificationsService;

    @GetMapping("/{id}")
    public Notifications getById(@PathVariable long id) {
        return notificationsService.getNotificationById(id);
    }

    @GetMapping
    public List<Notifications> getAll() {
        return notificationsService.getAllNotifications();
    }
}

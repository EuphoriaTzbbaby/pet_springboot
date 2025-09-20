package tzb.controller.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Notifications;
import tzb.service.NotificationsService;

@RestController
@RequestMapping("/notifications")
public class NotificationsCreateController {

    @Autowired
    private NotificationsService notificationsService;

    @PostMapping
    public int create(@RequestBody Notifications notification) {
        return notificationsService.createNotification(notification);
    }
}

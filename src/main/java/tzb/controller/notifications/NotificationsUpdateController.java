package tzb.controller.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Notifications;
import tzb.service.NotificationsService;

@RestController
@RequestMapping("/notifications")
public class NotificationsUpdateController {

    @Autowired
    private NotificationsService notificationsService;

    @PutMapping("/update")
    public int update(@RequestBody Notifications notification) {
        return notificationsService.updateNotification(notification);
    }
}

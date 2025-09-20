package tzb.controller.notifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.NotificationsService;

@RestController
@RequestMapping("/notifications")
public class NotificationsDeleteController {

    @Autowired
    private NotificationsService notificationsService;

    @DeleteMapping("/{id}")
    public int delete(@PathVariable long id) {
        return notificationsService.deleteNotification(id);
    }
}

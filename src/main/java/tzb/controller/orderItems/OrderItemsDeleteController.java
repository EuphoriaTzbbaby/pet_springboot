package tzb.controller.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.OrderItemsService;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsDeleteController {

    @Autowired
    private OrderItemsService orderItemsService;

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable("id") Integer id) {
        int result = orderItemsService.deleteItem(id);
        return result > 0 ? "Order item deleted successfully" : "Failed to delete order item";
    }
}

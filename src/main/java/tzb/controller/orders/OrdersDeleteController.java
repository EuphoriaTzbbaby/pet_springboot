package tzb.controller.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersDeleteController {

    @Autowired
    private OrdersService ordersService;

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable("id") Integer id) {
        int result = ordersService.deleteOrder(id);
        return result > 0 ? "Order deleted successfully" : "Failed to delete order";
    }
}

package tzb.controller.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Orders;
import tzb.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersUpdateController {

    @Autowired
    private OrdersService ordersService;

    @PutMapping("/{id}")
    public String updateOrder(@PathVariable("id") Integer id, @RequestBody Orders order) {
        order.setOrderId(id);
        int result = ordersService.updateOrder(order);
        return result > 0 ? "Order updated successfully" : "Failed to update order";
    }
}

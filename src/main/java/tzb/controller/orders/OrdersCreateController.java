package tzb.controller.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Orders;
import tzb.service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersCreateController {

    @Autowired
    private OrdersService ordersService;

    @PostMapping
    public String createOrder(@RequestBody Orders order) {
        int result = ordersService.createOrder(order);
        return result > 0 ? "Order created successfully" : "Failed to create order";
    }
}

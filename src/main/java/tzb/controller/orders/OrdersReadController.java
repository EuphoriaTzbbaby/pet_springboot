package tzb.controller.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.Orders;
import tzb.service.OrdersService;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersReadController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable("id") Integer id) {
        return ordersService.getOrderById(id);
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }
}

package tzb.controller.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.OrderItems;
import tzb.service.OrderItemsService;

import java.util.List;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsReadController {

    @Autowired
    private OrderItemsService orderItemsService;

    @GetMapping("/{id}")
    public OrderItems getItemById(@PathVariable("id") Integer id) {
        return orderItemsService.getItemById(id);
    }

    @GetMapping
    public List<OrderItems> getAllItems() {
        return orderItemsService.getAllItems();
    }
}

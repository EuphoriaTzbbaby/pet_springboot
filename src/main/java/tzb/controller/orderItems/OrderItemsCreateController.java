package tzb.controller.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.OrderItems;
import tzb.service.OrderItemsService;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsCreateController {

    @Autowired
    private OrderItemsService orderItemsService;

    @PostMapping
    public String createItem(@RequestBody OrderItems item) {
        int result = orderItemsService.createItem(item);
        return result > 0 ? "Order item created successfully" : "Failed to create order item";
    }
}

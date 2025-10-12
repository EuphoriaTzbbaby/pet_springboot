package tzb.controller.orderItems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tzb.pojo.OrderItems;
import tzb.service.OrderItemsService;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsUpdateController {

    @Autowired
    private OrderItemsService orderItemsService;

    @PutMapping("/{id}")
    public String updateItem(@PathVariable("id") Integer id, @RequestBody OrderItems item) {
        item.setItemId(id);
        int result = orderItemsService.updateItem(item);
        return result > 0 ? "Order item updated successfully" : "Failed to update order item";
    }
}

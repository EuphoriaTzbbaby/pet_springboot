package tzb.service;

import tzb.pojo.OrderItems;
import java.util.List;

public interface OrderItemsService {

    int createItem(OrderItems item);

    OrderItems getItemById(Integer itemId);

    List<OrderItems> getAllItems();

    int updateItem(OrderItems item);

    int deleteItem(Integer itemId);
}

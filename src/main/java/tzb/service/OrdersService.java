package tzb.service;

import tzb.pojo.Orders;
import java.util.List;

public interface OrdersService {

    int createOrder(Orders order);

    Orders getOrderById(Integer orderId);

    List<Orders> getAllOrders();

    int updateOrder(Orders order);

    int deleteOrder(Integer orderId);
}

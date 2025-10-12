package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.OrdersMapper;
import tzb.pojo.Orders;
import tzb.service.OrdersService;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int createOrder(Orders order) {
        return ordersMapper.insertOrder(order);
    }

    @Override
    public Orders getOrderById(Integer orderId) {
        return ordersMapper.selectById(orderId);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersMapper.selectAll();
    }

    @Override
    public int updateOrder(Orders order) {
        return ordersMapper.updateOrder(order);
    }

    @Override
    public int deleteOrder(Integer orderId) {
        return ordersMapper.deleteOrder(orderId);
    }
}

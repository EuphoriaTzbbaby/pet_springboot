package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.OrderItemsMapper;
import tzb.pojo.OrderItems;
import tzb.service.OrderItemsService;

import java.util.List;

@Service
public class OrderItemsServiceImpl implements OrderItemsService {

    @Autowired
    private OrderItemsMapper orderItemsMapper;

    @Override
    public int createItem(OrderItems item) {
        return orderItemsMapper.insertItem(item);
    }

    @Override
    public OrderItems getItemById(Integer itemId) {
        return orderItemsMapper.selectById(itemId);
    }

    @Override
    public List<OrderItems> getAllItems() {
        return orderItemsMapper.selectAll();
    }

    @Override
    public int updateItem(OrderItems item) {
        return orderItemsMapper.updateItem(item);
    }

    @Override
    public int deleteItem(Integer itemId) {
        return orderItemsMapper.deleteItem(itemId);
    }
}

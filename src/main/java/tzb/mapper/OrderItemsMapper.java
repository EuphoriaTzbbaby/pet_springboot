package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.OrderItems;
import java.util.List;

@Mapper
public interface OrderItemsMapper {

    @Insert("INSERT INTO order_items (order_id, product_id, quantity, price) " +
            "VALUES (#{orderId}, #{productId}, #{quantity}, #{price})")
    @Options(useGeneratedKeys = true, keyProperty = "itemId")
    int insertItem(OrderItems item);

    @Select("SELECT * FROM order_items WHERE item_id = #{itemId}")
    OrderItems selectById(Integer itemId);

    @Select("SELECT * FROM order_items")
    List<OrderItems> selectAll();

    @Update("UPDATE order_items SET order_id = #{orderId}, product_id = #{productId}, " +
            "quantity = #{quantity}, price = #{price} WHERE item_id = #{itemId}")
    int updateItem(OrderItems item);

    @Delete("DELETE FROM order_items WHERE item_id = #{itemId}")
    int deleteItem(Integer itemId);
}

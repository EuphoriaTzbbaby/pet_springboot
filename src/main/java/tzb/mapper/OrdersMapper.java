package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Orders;
import java.util.List;

@Mapper
public interface OrdersMapper {

    @Insert("INSERT INTO orders (user_id, total_price, status, created_at, updated_at) " +
            "VALUES (#{userId}, #{totalPrice}, #{status}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "orderId")
    int insertOrder(Orders order);

    @Select("SELECT * FROM orders WHERE order_id = #{orderId}")
    Orders selectById(Integer orderId);

    @Select("SELECT * FROM orders")
    List<Orders> selectAll();

    @Update("UPDATE orders SET user_id = #{userId}, total_price = #{totalPrice}, status = #{status}, " +
            "updated_at = #{updatedAt} WHERE order_id = #{orderId}")
    int updateOrder(Orders order);

    @Delete("DELETE FROM orders WHERE order_id = #{orderId}")
    int deleteOrder(Integer orderId);
}

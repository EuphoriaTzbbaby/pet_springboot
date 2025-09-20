package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.Products;

import java.util.List;

@Mapper
public interface ProductsMapper {

    // 插入
    @Insert("INSERT INTO products (category_id, name, description, price, stock, status, created_at, updated_at) " +
            "VALUES (#{categoryId}, #{name}, #{description}, #{price}, #{stock}, #{status}, NOW(), NOW())")
    @Options(useGeneratedKeys = true, keyProperty = "productId")
    int insertProduct(Products product);

    // 查询单个
    @Select("SELECT * FROM products WHERE product_id = #{id}")
    Products selectById(Integer id);

    // 查询所有
    @Select("SELECT * FROM products ORDER BY created_at DESC")
    List<Products> selectAll();

    // 按分类查
    @Select("SELECT * FROM products WHERE category_id = #{categoryId}")
    List<Products> selectByCategory(Integer categoryId);

    // 更新
    @Update("UPDATE products SET name=#{name}, description=#{description}, price=#{price}, stock=#{stock}, " +
            "status=#{status}, updated_at=NOW() WHERE product_id=#{productId}")
    int updateProduct(Products product);

    // 库存修改
    @Update("UPDATE products SET stock=#{stock}, updated_at=NOW() WHERE product_id=#{id}")
    int updateStock(@Param("id") Integer id, @Param("stock") Integer stock);

    // 修改状态
    @Update("UPDATE products SET status=#{status}, updated_at=NOW() WHERE product_id=#{id}")
    int updateStatus(@Param("id") Integer id, @Param("status") String status);

    // 删除
    @Delete("DELETE FROM products WHERE product_id=#{id}")
    int deleteById(Integer id);

    // 批量删除
    @Delete("<script>" +
            "DELETE FROM products WHERE product_id IN " +
            "<foreach collection='ids' item='id' open='(' separator=',' close=')'>#{id}</foreach>" +
            "</script>")
    int deleteBatch(@Param("ids") List<Integer> ids);
}

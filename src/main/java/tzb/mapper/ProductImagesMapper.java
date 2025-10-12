package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.ProductImages;
import java.util.List;

@Mapper
public interface ProductImagesMapper {

    @Select("SELECT * FROM product_images WHERE image_id = #{id}")
    ProductImages getById(Integer id);

    @Select("SELECT * FROM product_images")
    List<ProductImages> getAll();

    @Insert("INSERT INTO product_images(product_id, url, uploaded_at) " +
            "VALUES(#{productId}, #{url}, #{uploadedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "imageId")
    int insert(ProductImages productImages);

    @Update("UPDATE product_images SET product_id=#{productId}, url=#{url}, uploaded_at=#{uploadedAt} " +
            "WHERE image_id=#{imageId}")
    int update(ProductImages productImages);

    @Delete("DELETE FROM product_images WHERE image_id=#{id}")
    int delete(Integer id);
}

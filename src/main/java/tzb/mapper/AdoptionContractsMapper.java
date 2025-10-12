package tzb.mapper;

import org.apache.ibatis.annotations.*;
import tzb.pojo.AdoptionContracts;

import java.util.List;

@Mapper
public interface AdoptionContractsMapper {

    // 新增合同
    @Insert("INSERT INTO adoption_contracts (application_id, contract_text, signed_at, unsigned_at) " +
            "VALUES (#{applicationId}, #{contractText}, #{signedAt}, #{unsignedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "contractId")
    int insert(AdoptionContracts contract);

    // 根据合同 ID 查询
    @Select("SELECT * FROM adoption_contracts WHERE contract_id = #{id}")
    AdoptionContracts selectById(Integer id);

    // 根据申请 ID 查询合同
    @Select("SELECT * FROM adoption_contracts WHERE application_id = #{applicationId}")
    AdoptionContracts selectByApplicationId(Integer applicationId);

    // 查询所有合同
    @Select("SELECT * FROM adoption_contracts ORDER BY signed_at DESC")
    List<AdoptionContracts> selectAll();

    // 更新合同
    @Update("UPDATE adoption_contracts SET contract_text=#{contractText}, signed_at=#{signedAt}, unsigned_at=#{unsignedAt} " +
            "WHERE contract_id=#{contractId}")
    int update(AdoptionContracts contract);

    // 删除合同
    @Delete("DELETE FROM adoption_contracts WHERE contract_id=#{id}")
    int delete(Integer id);

    // 已签署合同数量
    @Select("SELECT COUNT(*) FROM adoption_contracts WHERE signed_at IS NOT NULL")
    int countSigned();
}

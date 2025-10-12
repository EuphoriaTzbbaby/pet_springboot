package tzb.service;

import tzb.pojo.AdoptionContracts;
import java.util.List;

public interface AdoptionContractsService {
    int createContract(AdoptionContracts contract);
    AdoptionContracts getContractById(Integer id);
    AdoptionContracts getContractByApplicationId(Integer applicationId);
    List<AdoptionContracts> getAllContracts();
    int updateContract(AdoptionContracts contract);
    int deleteContract(Integer id);
    int countSigned();
}

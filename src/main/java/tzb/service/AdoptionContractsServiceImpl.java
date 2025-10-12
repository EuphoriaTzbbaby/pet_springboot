package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.AdoptionContractsMapper;
import tzb.pojo.AdoptionContracts;
import tzb.service.AdoptionContractsService;

import java.util.List;

@Service
public class AdoptionContractsServiceImpl implements AdoptionContractsService {

    @Autowired
    private AdoptionContractsMapper mapper;

    @Override
    public int createContract(AdoptionContracts contract) {
        return mapper.insert(contract);
    }

    @Override
    public AdoptionContracts getContractById(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public AdoptionContracts getContractByApplicationId(Integer applicationId) {
        return mapper.selectByApplicationId(applicationId);
    }

    @Override
    public List<AdoptionContracts> getAllContracts() {
        return mapper.selectAll();
    }

    @Override
    public int updateContract(AdoptionContracts contract) {
        return mapper.update(contract);
    }

    @Override
    public int deleteContract(Integer id) {
        return mapper.delete(id);
    }

    @Override
    public int countSigned() {
        return mapper.countSigned();
    }
}

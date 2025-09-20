package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.PetsMapper;
import tzb.pojo.Pets;
import tzb.service.PetsService;

import java.util.List;

@Service
public class PetsServiceImpl implements PetsService {

    @Autowired
    private PetsMapper petsMapper;

    @Override
    public int create(Pets pet) {
        return petsMapper.insert(pet);
    }

    @Override
    public int update(Pets pet) {
        return petsMapper.update(pet);
    }

    @Override
    public int delete(Integer petId) {
        return petsMapper.delete(petId);
    }

    @Override
    public Pets findById(Integer petId) {
        return petsMapper.findById(petId);
    }

    @Override
    public List<Pets> findAll() {
        return petsMapper.findAll();
    }
}
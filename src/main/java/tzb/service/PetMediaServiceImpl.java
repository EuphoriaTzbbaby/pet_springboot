package tzb.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import tzb.mapper.PetMediaMapper;
import tzb.pojo.PetMedia;
import tzb.service.PetMediaService;

import java.util.List;

@Service
public class PetMediaServiceImpl implements PetMediaService {

    @Resource
    private PetMediaMapper petMediaMapper;

    @Override
    public PetMedia getById(Integer mediaId) {
        return petMediaMapper.selectById(mediaId);
    }

    @Override
    public List<PetMedia> getByPetId(Integer petId) {
        return petMediaMapper.selectByPetId(petId);
    }

    @Override
    public List<PetMedia> getAll() {
        return petMediaMapper.selectAll();
    }

    @Override
    public boolean add(PetMedia petMedia) {
        return petMediaMapper.insert(petMedia) > 0;
    }

    @Override
    public boolean update(PetMedia petMedia) {
        return petMediaMapper.update(petMedia) > 0;
    }

    @Override
    public boolean deleteById(Integer mediaId) {
        return petMediaMapper.deleteById(mediaId) > 0;
    }

    @Override
    public boolean deleteByPetId(Integer petId) {
        return petMediaMapper.deleteByPetId(petId) > 0;
    }

    @Override
    public int countByPetId(Integer petId) {
        return petMediaMapper.countByPetId(petId);
    }
}

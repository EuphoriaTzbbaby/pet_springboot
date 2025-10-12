package tzb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tzb.mapper.AdoptionApplicationsMapper;
import tzb.pojo.AdoptionApplications;
import tzb.service.AdoptionApplicationsService;

import java.sql.Timestamp;
import java.util.List;

@Service
public class AdoptionApplicationsServiceImpl implements AdoptionApplicationsService {

    @Autowired
    private AdoptionApplicationsMapper mapper;

    @Override
    public int createApplication(AdoptionApplications app) {
        app.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        app.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        app.setStatus("pending"); // 默认状态：待审核
        return mapper.insert(app);
    }

    @Override
    public AdoptionApplications getApplicationById(Integer id) {
        return mapper.selectById(id);
    }

    @Override
    public List<AdoptionApplications> getAllApplications() {
        return mapper.selectAll();
    }

    @Override
    public List<AdoptionApplications> getApplicationsByUserId(Integer userId) {
        return mapper.selectByUserId(userId);
    }

    @Override
    public List<AdoptionApplications> getApplicationsByPetId(Integer petId) {
        return mapper.selectByPetId(petId);
    }

    @Override
    public int updateApplication(AdoptionApplications app) {
        app.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        return mapper.update(app);
    }

    @Override
    public int deleteApplication(Integer id) {
        return mapper.delete(id);
    }

    @Override
    public int countByStatus(String status) {
        return mapper.countByStatus(status);
    }
}

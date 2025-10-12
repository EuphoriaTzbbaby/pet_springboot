package tzb.service;

import tzb.pojo.AdoptionApplications;
import java.util.List;

public interface AdoptionApplicationsService {
    int createApplication(AdoptionApplications app);
    AdoptionApplications getApplicationById(Integer id);
    List<AdoptionApplications> getAllApplications();
    List<AdoptionApplications> getApplicationsByUserId(Integer userId);
    List<AdoptionApplications> getApplicationsByPetId(Integer petId);
    int updateApplication(AdoptionApplications app);
    int deleteApplication(Integer id);
    int countByStatus(String status);
}

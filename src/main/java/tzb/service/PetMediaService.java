package tzb.service;

import tzb.pojo.PetMedia;

import java.util.List;

public interface PetMediaService {

    PetMedia getById(Integer mediaId);

    List<PetMedia> getByPetId(Integer petId);

    List<PetMedia> getAll();

    boolean add(PetMedia petMedia);

    boolean update(PetMedia petMedia);

    boolean deleteById(Integer mediaId);

    boolean deleteByPetId(Integer petId);

    int countByPetId(Integer petId);
}

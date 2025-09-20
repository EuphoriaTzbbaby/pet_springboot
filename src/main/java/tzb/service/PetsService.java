package tzb.service;

import tzb.pojo.Pets;

import java.util.List;

public interface PetsService {

    int create(Pets pet);

    int update(Pets pet);

    int delete(Integer petId);

    Pets findById(Integer petId);

    List<Pets> findAll();
}
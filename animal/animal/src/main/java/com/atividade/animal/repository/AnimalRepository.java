package com.atividade.animal.repository;

import com.atividade.animal.model.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findByNomeContainingIgnoreCase(String nome);
    List<Animal> findByIdPessoa(String idPessoa);
}

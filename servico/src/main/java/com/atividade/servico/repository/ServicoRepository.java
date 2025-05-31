package com.atividade.servico.repository;

import com.atividade.servico.model.Servico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicoRepository extends MongoRepository<Servico, String> {

    List<Servico> findByTipoContainingIgnoreCase(String tipo);

    List<Servico> findByIdAnimal(String idAnimal);
}

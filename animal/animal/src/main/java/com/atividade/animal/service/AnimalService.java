package com.atividade.animal.service;

import com.atividade.animal.model.Animal;
import com.atividade.animal.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal cadastrar(Animal animal) {
        return animalRepository.save(animal);
    }

    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

    public Optional<Animal> buscarPorId(String id) {
        return animalRepository.findById(id);
    }

    public List<Animal> buscarPorNome(String nome) {
        return animalRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Animal> buscarPorIdPessoa(String idPessoa) {
        return animalRepository.findByIdPessoa(idPessoa);
    }

    public void deletar(String id) {
        animalRepository.deleteById(id);
    }
}

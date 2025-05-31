package com.atividade.animal.controller;

import com.atividade.animal.model.Animal;
import com.atividade.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animais")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> cadastrar(@RequestBody Animal animal) {
        Animal salvo = animalService.cadastrar(animal);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Animal>> listarTodos() {
        return ResponseEntity.ok(animalService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> buscarPorId(@PathVariable String id) {
        return animalService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Animal>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(animalService.buscarPorNome(nome));
    }

    @GetMapping("/pessoa/{idPessoa}")
    public ResponseEntity<List<Animal>> buscarPorIdPessoa(@PathVariable String idPessoa) {
        return ResponseEntity.ok(animalService.buscarPorIdPessoa(idPessoa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        animalService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

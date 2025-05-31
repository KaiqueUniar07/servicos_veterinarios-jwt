package com.atividade.servico.controller;

import com.atividade.servico.model.Servico;
import com.atividade.servico.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public ResponseEntity<Servico> cadastrar(@RequestBody Servico servico) {
        return ResponseEntity.ok(servicoService.cadastrar(servico));
    }

    @GetMapping
    public ResponseEntity<List<Servico>> listarTodos() {
        return ResponseEntity.ok(servicoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable String id) {
        return servicoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Servico>> buscarPorTipo(@RequestParam String tipo) {
        return ResponseEntity.ok(servicoService.buscarPorTipo(tipo));
    }

    @GetMapping("/animal/{idAnimal}")
    public ResponseEntity<List<Servico>> buscarPorIdAnimal(@PathVariable String idAnimal) {
        return ResponseEntity.ok(servicoService.buscarPorIdAnimal(idAnimal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        servicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}

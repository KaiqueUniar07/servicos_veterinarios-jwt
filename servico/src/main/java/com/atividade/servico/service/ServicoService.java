package com.atividade.servico.service;

import com.atividade.servico.model.Servico;
import com.atividade.servico.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico cadastrar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> listarTodos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> buscarPorId(String id) {
        return servicoRepository.findById(id);
    }

    public List<Servico> buscarPorTipo(String tipo) {
        return servicoRepository.findByTipoContainingIgnoreCase(tipo);
    }

    public List<Servico> buscarPorIdAnimal(String idAnimal) {
        return servicoRepository.findByIdAnimal(idAnimal);
    }

    public void deletar(String id) {
        servicoRepository.deleteById(id);
    }
}

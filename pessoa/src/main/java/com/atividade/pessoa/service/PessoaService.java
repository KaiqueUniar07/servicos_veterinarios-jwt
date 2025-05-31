package com.atividade.pessoa.service;

import com.atividade.pessoa.model.Pessoa;
import com.atividade.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> buscarPorId(String id) {
        return pessoaRepository.findById(id);
    }

    public void deletar(String id) {
        pessoaRepository.deleteById(id);
    }
}

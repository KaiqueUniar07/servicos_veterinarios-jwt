package com.atividade.pessoa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pessoas")
public class Pessoa {
    @Id
    private String id;

    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
}

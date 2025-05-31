package com.atividade.animal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "animais")
public class Animal {

    @Id
    private String id;

    private String nome;
    private String tipo;
    private String raca;
    private int idade;

    private String idPessoa;
}

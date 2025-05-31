package com.atividade.servico.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "servicos")
public class Servico {

    @Id
    private String id;

    private LocalDate data;
    private String tipo;      // exemplo: consulta, vacinação, banho, cirurgia
    private Double valor;
    private String status;    // exemplo: agendado, realizado, cancelado

    private String idAnimal;  // referência ao animal atendido
}

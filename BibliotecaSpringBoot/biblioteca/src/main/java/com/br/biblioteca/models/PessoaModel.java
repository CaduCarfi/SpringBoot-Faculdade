package com.br.biblioteca.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cpf;
    private String nome;

}

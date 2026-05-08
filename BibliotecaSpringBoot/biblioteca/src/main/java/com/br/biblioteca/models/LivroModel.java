package com.br.biblioteca.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class LivroModel {

    private Long id;
    private String nome;
    private String author;

    @OneToMany
    private PessoaModel pessoa;
}

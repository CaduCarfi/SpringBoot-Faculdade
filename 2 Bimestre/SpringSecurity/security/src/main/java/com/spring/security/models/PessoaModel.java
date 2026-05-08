package com.spring.security.models;

import jdk.jfr.events.CertificateId;

@Entity
@Table(name = "TBL_PESSOAS")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private String nome;
}

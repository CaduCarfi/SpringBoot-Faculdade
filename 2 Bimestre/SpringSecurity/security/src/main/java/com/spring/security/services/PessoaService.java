package com.spring.security.services;

import com.spring.security.models.PessoaModel;
import com.spring.security.repositories.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();
    }

    public PessoaModel criarPessoa(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }
}

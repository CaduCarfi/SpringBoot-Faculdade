package com.example.demo.service;

import com.example.demo.model.EstudanteModel;
import com.example.demo.repositories.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    private final EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public EstudanteModel criarEstudante(EstudanteModel estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<EstudanteModel> findAll() {
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

    public EstudanteModel buscarId(Long id) {
        return estudanteRepository.findById(id).orElse(null);
    }

    public EstudanteModel atualizarEstudante(Long id, EstudanteModel estudanteModel) {
        EstudanteModel estudante = estudanteRepository.findById(id).orElse(null);

        estudante.setNome(estudanteModel.getNome());

        return estudanteRepository.save(estudante);
    }
}
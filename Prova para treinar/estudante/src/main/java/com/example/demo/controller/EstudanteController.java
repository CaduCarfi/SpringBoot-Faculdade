package com.example.demo.controller;

import com.example.demo.model.EstudanteModel;
import com.example.demo.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    // Criar estudante
    @PostMapping
    public ResponseEntity<EstudanteModel> criarEstudante(@RequestBody EstudanteModel estudanteModel) {

        EstudanteModel estudante = estudanteService.criarEstudante(estudanteModel);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(estudante.getId())
                .toUri();

        return ResponseEntity.created(uri).body(estudante);
    }

    // Listar todos estudantes
    @GetMapping
    public ResponseEntity<List<EstudanteModel>> findAll() {
        List<EstudanteModel> requeste = estudanteService.findAll();
        return ResponseEntity.ok(requeste);
    }

    // Buscar estudante por id
    @GetMapping("/{id}")
    public ResponseEntity<EstudanteModel> buscarId(@PathVariable Long id) {
        EstudanteModel estudante = estudanteService.buscarId(id);
        return ResponseEntity.ok(estudante);
    }

    // Atualizar estudante
    @PutMapping("/{id}")
    public ResponseEntity<EstudanteModel> atualizarEstudante(
            @PathVariable Long id,
            @RequestBody EstudanteModel estudanteModel) {

        EstudanteModel estudanteAtualizado = estudanteService.atualizarEstudante(id, estudanteModel);
        return ResponseEntity.ok(estudanteAtualizado);
    }

    // Deletar estudante
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
        return ResponseEntity.noContent().build();
    }
}
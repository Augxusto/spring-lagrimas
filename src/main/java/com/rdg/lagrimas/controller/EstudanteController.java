package com.rdg.lagrimas.controller;

import com.rdg.lagrimas.entity.Estudante;
import com.rdg.lagrimas.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService service;

    @PostMapping
    public Estudante criar(@RequestBody Estudante estudante) {
        return service.salvar(estudante);
    }

    @GetMapping
    public List<Estudante> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Estudante> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
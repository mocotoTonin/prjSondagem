package com.marco.demo.controller;


import org.springframework.web.bind.annotation.*;

import com.marco.demo.entity.Projeto;
import com.marco.demo.service.ProjetoService;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService projetoService;

    public ProjetoController (ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping
    public List<Projeto> listarProjetos() {
        return projetoService.listarTodos();
    }

    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        return projetoService.salvar(projeto);
    }
}


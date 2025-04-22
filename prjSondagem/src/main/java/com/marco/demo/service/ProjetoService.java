package com.marco.demo.service;


import org.springframework.stereotype.Service;

import com.marco.demo.entity.Projeto;
import com.marco.demo.repository.ProjetoRepository;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;

    public ProjetoService (ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
}


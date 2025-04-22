package com.marco.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.marco.demo.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}

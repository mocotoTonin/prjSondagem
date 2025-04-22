package com.marco.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.marco.demo.entity.Funcionario;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

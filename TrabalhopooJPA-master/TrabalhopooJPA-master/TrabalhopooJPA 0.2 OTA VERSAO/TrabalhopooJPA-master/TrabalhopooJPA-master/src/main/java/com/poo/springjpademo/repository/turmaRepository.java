package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Turma;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface turmaRepository extends JpaRepository<Turma, Long> {
    Optional<Turma> findByNomeTurma(String nomeTurma);
    Optional<Turma> findById(Long Id);
}

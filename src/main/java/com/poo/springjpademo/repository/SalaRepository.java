package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Turma;
import com.poo.springjpademo.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import java.util.List;

public interface SalaRepository extends JpaRepository<Turma, Long> {

    Optional<Turma> findByNome(String nome);

}

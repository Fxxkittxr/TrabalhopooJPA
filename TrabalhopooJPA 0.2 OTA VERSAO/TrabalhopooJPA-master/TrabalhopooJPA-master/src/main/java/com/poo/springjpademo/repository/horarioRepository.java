package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Horario;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface horarioRepository extends JpaRepository<Horario, Long> {
    Optional<Horario> findByAula(Long aula);
}

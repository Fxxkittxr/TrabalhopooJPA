package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Disciplina;
import com.poo.springjpademo.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import java.util.List;

public interface HorarioRepository extends JpaRepository<Horario, Long> {

    Optional<Horario> findByNome(String nome);

}
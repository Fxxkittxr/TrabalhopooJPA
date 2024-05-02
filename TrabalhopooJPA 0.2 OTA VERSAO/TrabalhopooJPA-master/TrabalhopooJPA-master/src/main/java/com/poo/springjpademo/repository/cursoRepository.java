package com.poo.springjpademo.repository;


import com.poo.springjpademo.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface cursoRepository extends JpaRepository<Curso, Long> {
    Optional<Curso> findByNomeCurso(String nomeCurso);
}
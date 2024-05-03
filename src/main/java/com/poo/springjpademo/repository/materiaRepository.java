package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Materia;
import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface materiaRepository extends JpaRepository<Materia, Long> {
    List<Materia> findAllByNomeProfessor(Professor professor);
    List<Materia> findByNomeMateria(String nomeMateria);
}

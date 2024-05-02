package com.poo.springjpademo.repository;


import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface professorRepository extends JpaRepository<Professor, Long> {
    Optional<Professor> findAllByProfessor(Professor professor);

}

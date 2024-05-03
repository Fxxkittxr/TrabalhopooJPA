package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.PlanoAula;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface planoaulaRepository extends JpaRepository<PlanoAula, Long> {
    Optional<PlanoAula> findByCodigo(String Codigo);
}

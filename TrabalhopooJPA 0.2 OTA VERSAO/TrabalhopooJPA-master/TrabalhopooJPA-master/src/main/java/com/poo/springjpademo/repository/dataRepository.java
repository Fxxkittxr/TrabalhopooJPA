package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface dataRepository extends JpaRepository<data, Long> {
    Optional<data> findBydata(LocalDate data);
}

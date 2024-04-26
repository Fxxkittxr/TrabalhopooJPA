package com.poo.springjpademo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeSala;
    public Sala(String nomeSala){
        this.nomeSala = nomeSala;
    }
}

package com.poo.springjpademo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    @ManyToOne
    private Sala nomeSala;
    public Horario(LocalDate data, Sala nomeSala,LocalTime horaInicio,LocalTime horaFim){
        this.data = data;
        this.nomeSala = nomeSala;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        //criar horario 1,2,3,4 referente a aula  1,2,3,4 e puxar depois apenas por id
    }
}

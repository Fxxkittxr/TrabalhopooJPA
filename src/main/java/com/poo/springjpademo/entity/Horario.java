package com.poo.springjpademo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Horario{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long aula;
    private String horaInicio;
    private String horaFim;

    public Horario(String horaInicio, String horaFim){
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
}
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
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeMateria;

    @ManyToOne
    private Professor nomeProfessor;

    public Materia(String nomeMateria, Professor nomeProfessor){
        this.nomeMateria = nomeMateria;
        this.nomeProfessor = nomeProfessor;
    }
}

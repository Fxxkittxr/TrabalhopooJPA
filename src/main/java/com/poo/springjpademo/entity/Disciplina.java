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
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeDisciplina;

    @ManyToOne
    private Professor professor;
    private Horario horario;
    public Disciplina(String nomeDisciplina, Professor professor, Horario id){
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.horario = id;
    }
}

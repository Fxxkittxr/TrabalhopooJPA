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
public class PlanoAula{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;

    @ManyToOne
    private Sala nomeSala;
    @OneToMany
    private Horario aula;
    @ManyToOne
    private Materia nomeMateria;
    @ManyToOne
    private Turma nomeTurma;
    public PlanoAula (String codigo, 
                        Sala nomeSala, 
                        Horario aula, 
                        Materia nomeMateria, 
                        Turma nomeTurma
                        ){
        this.codigo  = codigo;
        this.nomeSala = nomeSala;
        this.aula = aula;
        this.nomeMateria = nomeMateria;
        this.nomeTurma = nomeTurma;
    }
}

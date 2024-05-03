package com.poo.springjpademo.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
public class data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*private LocalDate data;*/
    private long id;
    private String data;

    @ManyToOne 
    private PlanoAula codigo1;
    @ManyToOne
    private PlanoAula codigo2;
    @ManyToOne
    private PlanoAula codigo3;
    @ManyToOne
    private PlanoAula codigo4;
    @ManyToOne
    private PlanoAula codigo5;
    @ManyToOne
    private PlanoAula codigo6;
    @ManyToOne
    private PlanoAula codigo7;
    @ManyToOne
    private PlanoAula codigo8;
    public data(String data,
                PlanoAula codigo1,
                PlanoAula codigo2,
                PlanoAula codigo3,
                PlanoAula codigo4,
                PlanoAula codigo5,
                PlanoAula codigo6,
                PlanoAula codigo7,
                PlanoAula codigo8
                    ){
        this.data  = data;
        this.codigo1 = codigo1;
        this.codigo2 = codigo2;
        this.codigo3 = codigo3;
        this.codigo4 = codigo4;
        this.codigo1 = codigo5;
        this.codigo2 = codigo6;
        this.codigo3 = codigo7;
        this.codigo4 = codigo8;
    }
}

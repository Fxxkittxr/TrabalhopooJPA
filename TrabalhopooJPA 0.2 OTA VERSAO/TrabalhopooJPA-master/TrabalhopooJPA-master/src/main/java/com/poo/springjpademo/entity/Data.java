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
public class Data{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*private LocalDate data;*/
    private String data   = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    @ManyToOne 
    private PlanoAula codigo1;
    private PlanoAula codigo2;
    private PlanoAula codigo3;
    private PlanoAula codigo4;
    private PlanoAula codigo5;
    private PlanoAula codigo6;
    private PlanoAula codigo7;
    private PlanoAula codigo8;
    public Data (String data, 
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

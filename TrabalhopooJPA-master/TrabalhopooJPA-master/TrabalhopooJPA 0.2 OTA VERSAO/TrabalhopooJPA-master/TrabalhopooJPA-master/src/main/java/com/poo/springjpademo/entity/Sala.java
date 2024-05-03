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
public class Sala{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nomeSala;

    public Sala(String nomeSala){
        this.nomeSala = nomeSala;
    }
}

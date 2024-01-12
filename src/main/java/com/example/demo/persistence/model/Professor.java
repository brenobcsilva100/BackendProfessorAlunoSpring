package com.example.demo.persistence.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Professor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "professor")
    private List<Aluno> alunos;

}

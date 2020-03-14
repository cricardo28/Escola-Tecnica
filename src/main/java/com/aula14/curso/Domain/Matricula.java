package com.aula14.curso.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "matricula")

public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idMatricula;

    @ManyToOne
    @JoinColumn(name = "id_turma",nullable = false)
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "id_aluno",nullable = false)
    private Aluno aluno;

    public Matricula() {

    }

    public Matricula(Turma turma, Aluno aluno) {
        this.turma = turma;
        this.aluno = aluno;
    }
}

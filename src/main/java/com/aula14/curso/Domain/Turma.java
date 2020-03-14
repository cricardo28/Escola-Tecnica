package com.aula14.curso.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "turma")

public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idTurma;

    @ManyToOne
    @JoinColumn(name = "id_curso",nullable = false)
    private Curso curso;
    private String dataInicio;
    private String dataFinal;

    @OneToMany(mappedBy = "turma")
    private List<Matricula> matriculaList;

    public Turma() {
    }

    public Turma(Curso curso, String dataInicio, String dataFinal) {
        this.curso = curso;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }
}

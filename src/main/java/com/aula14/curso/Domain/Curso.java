package com.aula14.curso.Domain;


import com.aula14.curso.Enum.ModalidadeEnum;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idCurso;
    private String nome;
    private String descricao;
    private String requisitos;
    private ModalidadeEnum modalidade;

    @OneToMany(mappedBy = "curso")
    private List<Turma> turmaList;

    public Curso() {
    }

    public Curso(String nome, String descricao, String requisitos, ModalidadeEnum modalidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.requisitos = requisitos;
        this.modalidade = modalidade;    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public ModalidadeEnum getModalidade() {
        return modalidade;
    }

    public void setModalidade(ModalidadeEnum modalidade) {
        this.modalidade = modalidade;
    }

    public List<Turma> getTurmaList() {
        return turmaList;
    }

    public void setTurmaList(List<Turma> turmaList) {
        this.turmaList = turmaList;
    }
}

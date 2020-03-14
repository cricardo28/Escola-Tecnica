package com.aula14.curso.DTO;

import javax.persistence.*;

public class MatriculaDTO {

    private long idMatricula;
    private long idTurma;
    private long idAluno;

    public MatriculaDTO() {

    }

    public MatriculaDTO(long idTurma, long idAluno) {
        this.idTurma = idTurma;
        this.idAluno = idAluno;
    }

    public MatriculaDTO(long idMatricula, long idTurma, long idAluno) {
        this.idMatricula = idMatricula;
        this.idTurma = idTurma;
        this.idAluno = idAluno;
    }

    public long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(long idAluno) {
        this.idAluno = idAluno;
    }
}

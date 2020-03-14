package com.aula14.curso.DTO;

import java.util.List;


public class TurmaDTO {
    private long idTurma;
    private long idCurso;
    private String dataInicio;
    private String dataFinal;
    private List<Long> idMatriculas;

    public TurmaDTO() {
    }

    public TurmaDTO(long idCurso, String dataInicio, String dataFinal, List<Long> idMatriculas) {
        this.idCurso = idCurso;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.idMatriculas = idMatriculas;
    }

    public TurmaDTO(long idTurma, long idCurso, String dataInicio, String dataFinal, List<Long> idMatriculas) {
        this.idTurma = idTurma;
        this.idCurso = idCurso;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.idMatriculas = idMatriculas;
    }

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(long idCurso) {
        this.idCurso = idCurso;
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

    public List<Long> getIdMatriculas() {
        return idMatriculas;
    }

    public void setIdMatriculas(List<Long> idMatriculas) {
        this.idMatriculas = idMatriculas;
    }
}


package com.aula14.curso.Controller;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Domain.Matricula;
import com.aula14.curso.Domain.Turma;
import com.aula14.curso.Enum.ModalidadeEnum;
import com.aula14.curso.Repository.MatriculaRepository;
import com.aula14.curso.Service.MatriculaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatriculaControllerTest {

    private MatriculaRepository matriculaRepository;

    @BeforeEach
    public void setUP(){
        this.matriculaRepository = Mockito.mock(MatriculaRepository.class);
    }

    @Test
    void salvaMatriculaComSucesso(){

        // ENTRA
        Aluno aluno = new Aluno("Alessandro", "1234", "01/01/1990", "51-988448484");
        Curso curso = new Curso("JAVA", "Curso de duas semanas.", "conhecimento de programação",  ModalidadeEnum.TECH);
        Turma turma = new Turma(curso, "10/10/2021", "25/10/2021");
        Matricula esperado = new Matricula(turma,aluno);

        Mockito.when(matriculaRepository.save(esperado)).thenReturn(esperado);
        // EXECUTA
        MatriculaService matriculaService = new MatriculaService(matriculaRepository);
        Matricula atual = matriculaService.salvar(esperado);

        // VALIDA
        assertEquals(esperado, atual);
    }
}

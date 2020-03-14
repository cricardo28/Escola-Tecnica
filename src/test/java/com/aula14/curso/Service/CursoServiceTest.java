package com.aula14.curso.Service;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Enum.ModalidadeEnum;
import com.aula14.curso.Repository.AlunoRepository;
import com.aula14.curso.Repository.CursoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoServiceTest {

    private CursoRepository cursoRepository;

    @BeforeEach
    public void setUP(){
        this.cursoRepository = Mockito.mock(CursoRepository.class);
    }

    private String nome;
    private String descricao;
    private String requisitos;
    private ModalidadeEnum modalidade;
    @Test
    void salvaCursoComSucesso(){
        // ENTRA
        Curso esperado = new Curso("JAVA", "curso de duas semanas", "conhecimento de programação",  ModalidadeEnum.TECH);

        Mockito.when(cursoRepository.save(esperado)).thenReturn(esperado);
        // EXECUTA
        CursoService cursoService = new CursoService(cursoRepository);
        Curso atual = cursoService.salvar(esperado);

        // VALIDA
        assertEquals(esperado, atual);
    }

}

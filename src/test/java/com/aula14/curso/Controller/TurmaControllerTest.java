package com.aula14.curso.Controller;

import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Domain.Turma;
import com.aula14.curso.Enum.ModalidadeEnum;
import com.aula14.curso.Repository.TurmaRepository;
import com.aula14.curso.Service.TurmaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurmaControllerTest {

    private TurmaRepository turmaRepository;

    @BeforeEach
    public void setUP(){
        this.turmaRepository = Mockito.mock(TurmaRepository.class);
    }

    private String nome;
    private String descricao;
    private String requisitos;
    private ModalidadeEnum modalidade;
    @Test
    void salvaTurmaComSucesso(){
        // ENTRA
        Curso curso = new Curso("JAVA", "Curso de duas semanas.", "conhecimento de programação",  ModalidadeEnum.TECH);
        Turma esperado = new Turma(curso, "10/10/2021", "25/10/2021");

        Mockito.when(turmaRepository.save(esperado)).thenReturn(esperado);
        // EXECUTA
        TurmaService turmaService = new TurmaService(turmaRepository);
        Turma atual = turmaService.salvar(esperado);

        // VALIDA
        assertEquals(esperado, atual);
    }

}

package com.aula14.curso.Service;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Repository.AlunoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoServiceTest {
    private AlunoRepository alunoRepository;

    @BeforeEach
    public void setUP(){
        this.alunoRepository = Mockito.mock(AlunoRepository.class);
    }

    @Test
    void salvaAlunoComSucesso(){
        // ENTRA
        Aluno esperado = new Aluno("Alessandro", "1234", "01/01/1990", "51-988448484");

        Mockito.when(alunoRepository.save(esperado)).thenReturn(esperado);
        // EXECUTA
        AlunoService alunoService = new AlunoService(alunoRepository);
        Aluno atual = alunoService.salvar(esperado);

        // VALIDA
        assertEquals(esperado, atual);
    }

    @Test
    void salvaAlunoSemNome(){
        // ENTRA
        Aluno esperado = new Aluno(null, "1234", "01/01/1990", "51-988448484");

        // EXECUTA
        AlunoService alunoService = new AlunoService(alunoRepository);
        Aluno atual = alunoService.salvar(esperado);
        Mockito.when(alunoRepository.save(esperado)).thenReturn(esperado);

        // VALIDA
        Assertions.assertThrows(NullPointerException.class, () -> {
            alunoService.salvar(esperado);
        });
        Mockito.verifyNoInteractions(alunoRepository);
    }

}

package com.aula14.curso.Controller;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Repository.AlunoRepository;
import com.aula14.curso.Service.AlunoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoControllerTest {

    private AlunoService alunoService;

    @BeforeEach
    public void setUP(){
        this.alunoService = Mockito.mock(AlunoService.class);
    }

    @Test
    void salvaAlunoComSucesso(){
        // ENTRA
        Aluno esperado = new Aluno("Alessandro", "1234", "01/01/1990", "51-988448484");

        Mockito.when(alunoService.salvar(esperado)).thenReturn(esperado);
        // EXECUTA
        AlunoService alunoService = new AlunoService(null);
        AlunoController alunoController = new AlunoController(alunoService);
        String atualToString = alunoController.save(esperado);

        // VALIDA
        assertEquals(esperado.toString(), atualToString);
    }

}

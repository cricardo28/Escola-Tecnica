package com.aula14.curso.Controller;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Service.AlunoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping
    public String save(@RequestBody Aluno aluno) {
        return this.service.salvar(aluno).toString();
    }
}
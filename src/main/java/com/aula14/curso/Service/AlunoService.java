package com.aula14.curso.Service;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno salvar(Aluno aluno) {

        if(aluno.getNome() == null) {
            throw new NullPointerException();
        }

        return alunoRepository.save(aluno);
    }
}

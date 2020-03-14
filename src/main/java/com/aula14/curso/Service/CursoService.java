package com.aula14.curso.Service;

import com.aula14.curso.Domain.Aluno;
import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Repository.AlunoRepository;
import com.aula14.curso.Repository.CursoRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    private CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso salvar(Curso curso) {

        if(curso.getNome() == null) {
            throw new NullPointerException();
        }

        return cursoRepository.save(curso);
    }
}

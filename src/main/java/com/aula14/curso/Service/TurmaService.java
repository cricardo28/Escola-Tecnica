package com.aula14.curso.Service;

import com.aula14.curso.Domain.Turma;
import com.aula14.curso.Repository.TurmaRepository;

public class TurmaService {
    private TurmaRepository turmaRepository;
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public Turma salvar(Turma turma) {

        return turmaRepository.save(turma);
    }
}

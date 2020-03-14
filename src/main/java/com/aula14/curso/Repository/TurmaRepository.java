package com.aula14.curso.Repository;

import com.aula14.curso.Domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma,Long> {
}

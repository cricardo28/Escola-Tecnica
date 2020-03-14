package com.aula14.curso.Repository;

import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}

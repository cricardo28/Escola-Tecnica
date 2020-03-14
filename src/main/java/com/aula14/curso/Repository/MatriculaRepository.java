package com.aula14.curso.Repository;

import com.aula14.curso.Domain.Matricula;
import com.aula14.curso.Domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula,Long> {
}

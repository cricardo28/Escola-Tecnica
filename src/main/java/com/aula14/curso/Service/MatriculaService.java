package com.aula14.curso.Service;

import com.aula14.curso.Domain.Curso;
import com.aula14.curso.Domain.Matricula;
import com.aula14.curso.Repository.CursoRepository;
import com.aula14.curso.Repository.MatriculaRepository;


public class MatriculaService {


        private MatriculaRepository matriculaRepository;

        public MatriculaService(MatriculaRepository matriculaRepository) {
            this.matriculaRepository = matriculaRepository;
        }

        public Matricula salvar(Matricula matricula) {

            if(matricula == null) {
                throw new NullPointerException();
            }

            return matriculaRepository.save(matricula);
        }


}

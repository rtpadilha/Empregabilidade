package br.com.aim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.aim.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Integer>{

}

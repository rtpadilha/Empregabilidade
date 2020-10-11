package br.com.aim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aim.domain.Aluno;
import br.com.aim.repository.AlunoRepository;


@Service
public class AlunoService {
	
	
	@Autowired
	AlunoRepository repoAluno;
	
public List<Aluno> buscarTodosCurriculos(){
	return repoAluno.findAll();
}	
public Aluno salvar(Aluno aluno) {
	return repoAluno.save(aluno);
}
	

}

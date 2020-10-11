package br.com.aim.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("aluno")
public class AlunoController {
	
	
	
	@GetMapping("")
	public ModelAndView cadastroAlunos() {
	ModelAndView mv = new ModelAndView("cadastroAlunos");
	return mv;
}
	
	@GetMapping("/login")
	public ModelAndView loginAlunos() {
		ModelAndView mv = new ModelAndView("cadastroLoginAluno");
		return mv;
	}
	
	@GetMapping("/curriculo")
	public ModelAndView curriculoAlunos() {
	ModelAndView mv = new ModelAndView("editarCurriculo");
	return mv;
}
	
	
	

	

}

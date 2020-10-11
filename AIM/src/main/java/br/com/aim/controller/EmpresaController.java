package br.com.aim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class EmpresaController {

	
	@GetMapping("")
	public ModelAndView cadastroEmpresa() {
	ModelAndView mv = new ModelAndView("empresa/cadastroEmpresa");
	return mv;
}
	
	@GetMapping("")
	public ModelAndView loginEmpresa() {
		ModelAndView mv = new ModelAndView("empresa/loginEmpresa");
		return mv;
	}
	
	
}

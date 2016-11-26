package com.avaliacao.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.model.Prova;
import com.avaliacao.service.impl.AvaliacaoService;

@RestController
@RequestMapping("provas")
public class ProvaController {

	@Autowired
	private AvaliacaoService avaliacaoService;
	
	
	@GetMapping("alunos/{id}}")
	public List<Prova> listarProvasDoAluno(@PathVariable("idAluno") String idAluno){
		return avaliacaoService.listarProvasDoAluno(idAluno);
	}
}

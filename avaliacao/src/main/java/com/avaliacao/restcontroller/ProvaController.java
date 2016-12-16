package com.avaliacao.restcontroller;

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

	@GetMapping("alunos/{idAluno}")
	public List<Prova> getProvasDoAluno(@PathVariable("idAluno") String idAluno) {
		return avaliacaoService.findAll(idAluno);
	}
}

package com.avaliacao.service.hystrix.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avaliacao.model.Aluno;
import com.avaliacao.service.feign.AlunoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class AlunoServiceHystrix {

	@Autowired
	private AlunoService alunoService;

	@HystrixCommand(fallbackMethod = "findByCache")
	public Aluno findBy(String idAluno) {
		return alunoService.findBy(idAluno);
	}

	// METODO DE CACHE PARA ALUNOS
	public Aluno findByCache(String idAluno) {
		Aluno a = new Aluno();
		a.setNome("Aluno cache");
		return a;
	}
}

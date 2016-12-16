package com.avaliacao.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.model.Aluno;
import com.avaliacao.model.Materia;
import com.avaliacao.model.Prova;
import com.avaliacao.service.AvaliacaoService;
import com.avaliacao.service.hystrix.clients.AlunoServiceHystrix;
import com.avaliacao.service.hystrix.clients.AvaliacaoServiceHystrix;

@Service
public class AvaliacaoServiceImpl implements AvaliacaoService{

	@Autowired
	private AvaliacaoServiceHystrix avaliacaoServiceHystrix;

	@Autowired
	private AlunoServiceHystrix alunoServiceHystrix;

	@Override
	public List<Prova> findAll(String idAluno) {

		List<Materia> materias = this.avaliacaoServiceHystrix.listarMateriais();
		Aluno aluno = this.alunoServiceHystrix.findBy(idAluno);
		
		List<Prova> provas = new ArrayList<>();
		materias.forEach(materia -> {
			Prova p = new Prova();
			p.setNomeAluno(aluno.getNome());
			p.setNomeMateria(materia.getNome());
			p.setNota(new BigDecimal(10));
			provas.add(p);
		});
		return provas;

	}

}

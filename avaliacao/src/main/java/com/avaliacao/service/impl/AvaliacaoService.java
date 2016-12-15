package com.avaliacao.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaliacao.model.Aluno;
import com.avaliacao.model.Materia;
import com.avaliacao.model.Prova;
import com.avaliacao.service.AlunoService;
import com.avaliacao.service.MateriaService;

@Service
public class AvaliacaoService {

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private MateriaService materiaService;

	public Prova getProvaDoAluno(String idAluno) {

		Aluno aluno = this.alunoService.getOne(idAluno);

		Materia materia = this.materiaService.getMateria("1");

		Prova prova = new Prova();
		prova.setNomeAluno(aluno.getNome());
		prova.setNomeMateria(materia.getNome());
		prova.setNota(new BigDecimal(10));

		return prova;
	}

}

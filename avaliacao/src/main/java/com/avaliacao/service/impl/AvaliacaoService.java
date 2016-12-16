package com.avaliacao.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

	public List<Prova> findAll(String idAluno) {

		List<Materia> materias = materiaService.listarMateriais();
		Aluno aluno = this.alunoService.getOne(idAluno);
		
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

package com.avaliacao.service.impl;

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

	public List<Prova> listarProvasDoAluno(String idAluno) {

		Aluno aluno = this.alunoService.getOne(idAluno);

		List<Prova> provas = new ArrayList<>();

		List<Materia> materiaList = this.materiaService.listarMateriais();

		materiaList.forEach(materia -> {

			Prova prova = new Prova();
			prova.setIdAluno(aluno.getId());
			prova.setIdMateria(materia.getId());
			provas.add(prova);
		});

		return provas;
	}

}

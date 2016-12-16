package com.aluno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aluno.model.Aluno;
import com.aluno.repository.AlunoRepository;
import com.aluno.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	@Transactional
	public Aluno save(Aluno aluno) {
		return this.alunoRepository.save(aluno);
	}

	@Override
	public Aluno edit(Aluno aluno) {
		return this.save(aluno);
	}

	@Override
	public Aluno delete(Aluno aluno) {
		this.alunoRepository.delete(aluno);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		return this.alunoRepository.findAll();
	}

}

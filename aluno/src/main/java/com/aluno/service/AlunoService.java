package com.aluno.service;

import java.util.List;

import com.aluno.model.Aluno;

public interface AlunoService {

	public Aluno save(Aluno aluno);

	public Aluno edit(Aluno aluno);

	public Aluno delete(Aluno aluno);

	public List<Aluno> findAll();
}

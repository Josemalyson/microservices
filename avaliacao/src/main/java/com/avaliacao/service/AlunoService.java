package com.avaliacao.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.avaliacao.model.Aluno;

@FeignClient("alunos")
public interface AlunoService {

	@GetMapping
	public List<Aluno> listarAlunos();

	@GetMapping("alunos/{id}")
	public Aluno getOne(String idAluno);

}

package com.avaliacao.service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avaliacao.model.Aluno;

@FeignClient("alunos/alunos/")
public interface AlunoService {

	@RequestMapping(value="{id}", method = RequestMethod.GET)
	public Aluno findBy(@PathVariable("id") String idAluno);

}

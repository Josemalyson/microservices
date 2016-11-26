package com.avaliacao.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.avaliacao.model.Materia;

@FeignClient("materiais")
public interface MateriaService {

	@GetMapping
	public List<Materia> listarMateriais();

}

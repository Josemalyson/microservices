package com.avaliacao.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avaliacao.model.Materia;

@FeignClient("materias/materias")
public interface MateriaService {

	@RequestMapping(method = RequestMethod.GET)
	public List<Materia> listarMateriais();

}

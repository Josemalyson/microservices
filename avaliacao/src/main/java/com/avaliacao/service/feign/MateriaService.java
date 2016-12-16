package com.avaliacao.service.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avaliacao.model.Materia;

@FeignClient("materias/materias")
public interface MateriaService {

	@RequestMapping(method = RequestMethod.GET)
	public List<Materia> listarMateriais();

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Materia getMateria(@PathVariable("id") String id);

}

package com.avaliacao.service.hystrix.clients;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avaliacao.model.Materia;
import com.avaliacao.service.feign.MateriaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class AvaliacaoServiceHystrix {

	@Autowired
	private MateriaService materiaService;

	@HystrixCommand(fallbackMethod = "listarMateriasLocal")
	public List<Materia> listarMateriais() {
		return materiaService.listarMateriais();
	}

	//CACHE DE MATERIAS
	public List<Materia> listarMateriasLocal(){
		Materia m = new Materia();
		m.setNome("Geometria Cache");
		m.setProfessor("Antonio Cache");
		return Arrays.asList(m);
		
	}
}

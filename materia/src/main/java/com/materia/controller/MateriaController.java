package com.materia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.materia.model.Materia;
import com.materia.service.MateriaService;

@RestController
@RequestMapping("materias")
public class MateriaController {

	@Autowired
	private MateriaService materiaService;

	@GetMapping
	public List<Materia> findAll() {
		return materiaService.findAll();
	}
	
	@PostMapping
	public Materia salvar(@RequestBody Materia materia){
		return this.materiaService.save(materia);
	}
	
	@PutMapping
	public Materia editar(@RequestBody Materia materia){
		return this.materiaService.edit(materia);
	}
	
	@DeleteMapping
	public Materia excluir(@RequestBody Materia materia){
		return this.materiaService.delete(materia);
	}
}

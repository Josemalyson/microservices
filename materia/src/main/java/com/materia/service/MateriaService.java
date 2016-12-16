package com.materia.service;

import java.util.List;

import com.materia.model.Materia;

public interface MateriaService {

	public List<Materia> findAll();

	public Materia save(Materia materia);

	public Materia edit(Materia materia);

	public Materia delete(Materia materia);
}

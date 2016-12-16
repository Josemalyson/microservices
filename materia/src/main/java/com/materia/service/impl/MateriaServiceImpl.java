package com.materia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.materia.model.Materia;
import com.materia.repository.MateriaRepository;
import com.materia.service.MateriaService;

@Service
public class MateriaServiceImpl implements MateriaService {

	@Autowired
	private MateriaRepository materiaRepository;

	@Override
	public List<Materia> findAll() {
		return this.materiaRepository.findAll();
	}

	@Override
	@Transactional
	public Materia save(Materia materia) {
		return this.materiaRepository.save(materia);
	}

	@Override
	public Materia edit(Materia materia) {
		return this.save(materia);
	}

	@Override
	@Transactional
	public Materia delete(Materia materia) {
		this.materiaRepository.delete(materia);
		return materia;
	}

}

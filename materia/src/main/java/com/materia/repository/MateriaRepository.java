package com.materia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.materia.model.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

}

package com.materia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.materia.model.Materia;

@RepositoryRestResource(collectionResourceRel = "materias", path = "materias")
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}

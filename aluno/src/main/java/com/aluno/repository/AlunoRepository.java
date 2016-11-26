package com.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aluno.model.Aluno;

@RepositoryRestResource(collectionResourceRel = "alunos", path="alunos")
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

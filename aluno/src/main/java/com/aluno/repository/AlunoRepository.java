package com.aluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluno.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}

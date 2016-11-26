package com.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avaliacao.model.Prova;

public interface AvaliacaoRepository extends JpaRepository<Prova, Long> {

}

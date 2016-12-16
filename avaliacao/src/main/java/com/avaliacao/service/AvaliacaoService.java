package com.avaliacao.service;

import java.util.List;

import com.avaliacao.model.Prova;

public interface AvaliacaoService {

	public List<Prova> findAll(String idAluno);
}

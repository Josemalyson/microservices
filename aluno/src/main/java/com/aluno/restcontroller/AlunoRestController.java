package com.aluno.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.model.Aluno;
import com.aluno.service.AlunoService;

@RestController
@RequestMapping("alunos")
public class AlunoRestController {

	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public List<Aluno> findAll() {
		return this.alunoService.findAll();
	}

	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return this.alunoService.save(aluno);
	}

	@PutMapping
	public Aluno editar(@RequestBody Aluno aluno) {
		return this.alunoService.edit(aluno);
	}

	@DeleteMapping
	public Aluno excluir(@RequestBody Aluno aluno) {
		return this.alunoService.delete(aluno);
	}

}

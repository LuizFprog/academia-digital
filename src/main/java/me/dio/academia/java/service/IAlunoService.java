package me.dio.academia.java.service;

import java.util.List;

import me.dio.academia.java.models.Aluno;
import me.dio.academia.java.models.AvaliacaoFisica;
import me.dio.academia.java.models.form.AlunoForm;
import me.dio.academia.java.models.form.AlunoUpdateForm;

public interface IAlunoService {

	Aluno create(AlunoForm form);
	
	Aluno get(Long id);
	
	List<Aluno> getAll();
	
	Aluno update(AlunoUpdateForm formUpdate);
	
	void delete(Long id);
	
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}

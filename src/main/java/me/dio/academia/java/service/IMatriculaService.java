package me.dio.academia.java.service;

import java.util.List;

import me.dio.academia.java.models.Matricula;
import me.dio.academia.java.models.form.MatriculaForm;

public interface IMatriculaService {

	Matricula create(MatriculaForm form);
	
	Matricula get(Long id);
	
	List<Matricula> getAll();
	
	void delete(Long id);
}

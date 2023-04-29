package me.dio.academia.java.service;

import java.util.List;

import me.dio.academia.java.models.AvaliacaoFisica;
import me.dio.academia.java.models.form.AvaliacaoFisicaForm;
import me.dio.academia.java.models.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {

	AvaliacaoFisica create(AvaliacaoFisicaForm form);
	
	AvaliacaoFisica get(Long id);
	
	List<AvaliacaoFisica> getAll();
	
	AvaliacaoFisica update(AvaliacaoFisicaUpdateForm formUpdate);
	
	void delete(Long id);
}

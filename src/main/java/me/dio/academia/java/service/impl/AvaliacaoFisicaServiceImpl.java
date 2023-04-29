package me.dio.academia.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.java.models.AvaliacaoFisica;
import me.dio.academia.java.models.Aluno;
import me.dio.academia.java.models.form.AvaliacaoFisicaForm;
import me.dio.academia.java.models.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.java.repository.AlunoRepository;
import me.dio.academia.java.repository.AvaliacaoFisicaRepository;
import me.dio.academia.java.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{
	
	@Autowired
	private AvaliacaoFisicaRepository repository;
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
		AvaliacaoFisica avaliacao = new AvaliacaoFisica();
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		avaliacao.setAluno(aluno);
		avaliacao.setPeso(form.getPeso());
		avaliacao.setAltura(form.getAltura());
		return repository.save(avaliacao);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return repository.findAll();
	}

	@Override
	public AvaliacaoFisica update(AvaliacaoFisicaUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}

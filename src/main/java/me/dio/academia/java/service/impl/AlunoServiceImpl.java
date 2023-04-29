package me.dio.academia.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.java.models.Aluno;
import me.dio.academia.java.models.AvaliacaoFisica;
import me.dio.academia.java.models.form.AlunoForm;
import me.dio.academia.java.models.form.AlunoUpdateForm;
import me.dio.academia.java.repository.AlunoRepository;
import me.dio.academia.java.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{
	
	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setName(form.getName());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataNascimento(form.getDataNascimento());
		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public Aluno update(AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno.getAvaliacoes();
	}


}

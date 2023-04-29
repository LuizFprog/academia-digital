package me.dio.academia.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.java.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}

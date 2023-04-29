package me.dio.academia.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.academia.java.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}

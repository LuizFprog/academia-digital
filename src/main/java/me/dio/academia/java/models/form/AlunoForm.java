package me.dio.academia.java.models.form;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	private String name;
	private String cpf;
	private String bairro;
	private LocalDate dataNascimento;
}

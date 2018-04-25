package br.edu.ifal.systemifal.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@DiscriminatorValue ("A")
public class Aluno extends Pessoa{
		
	@Column
	private String matricula;

	
	public Aluno(String cpf, String nome) {
		setNome(nome);
		setCpf(cpf);
	}
	
	public Aluno(int id, String cpf, String nome) {
		setId(id);
		setNome(nome);
		setCpf(cpf);
	}

	public Aluno() {
		super();
	}
	
	

}

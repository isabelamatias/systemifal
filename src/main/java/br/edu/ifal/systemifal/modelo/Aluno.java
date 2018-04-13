package br.edu.ifal.systemifal.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="aluno")
@DiscriminatorValue ("A")
public class Aluno extends Pessoa{
	

	
	@Column
	private String matricula;
	
	@Column
	private String nome;

	
	@OneToMany
	private List<Professor> professor;
	
	public Aluno(String id, String matricula, String nome) {
		setNome(nome);
		setId(id);
		setMatricula(matricula);
	}

	public Aluno() {
		super();
	}
	public List<Professor> getProfessor() {
		return professor;
	}

	public void setProfessor(List<Professor> professor) {
		this.professor = professor;
	}
	

	

	
	
	

}

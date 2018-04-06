package br.edu.ifal.systemifal.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno extends Pessoa {
	
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

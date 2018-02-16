package br.edu.ifal.systemifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="disciplina")
public class Disciplina {
	@Id
	private String id;
	
	@Column
	private String matricula;
	
	@Column
	private String nome;

	public Disciplina(String id, String matricula, String nome) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
	}

	public Disciplina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
	
	

}

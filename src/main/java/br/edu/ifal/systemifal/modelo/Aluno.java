package br.edu.ifal.systemifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String id;
	
	@Column
	private String matricula;
	
	@Column
	private String nome;
	
	
	public Aluno(String id, String matricula, String nome) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
	}


	public Aluno() {
		super();
		
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
		return "Aluno [id=" + id + ", matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
	

}

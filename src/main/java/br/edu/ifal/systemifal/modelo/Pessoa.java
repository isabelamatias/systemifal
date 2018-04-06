package br.edu.ifal.systemifal.modelo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "pessoa")
@DiscriminatorColumn(name = "cargo")
public class Pessoa {

	private String id;
	private String nome;
	private String matricula;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", matricula=" + matricula + "]";
	}
	


	
	
	
	
	
}

package br.edu.ifal.systemifal.modelo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table( name = "pessoa")
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "cargo")
public class Pessoa {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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

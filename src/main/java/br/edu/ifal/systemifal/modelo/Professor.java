package br.edu.ifal.systemifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String id;
	
	@Column
	private String nome;

	public Professor(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
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
		return "Professor [id=" + id + ", nome=" + nome +"]";
	}
	

	
	
	
	
	
	

}

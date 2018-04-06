package br.edu.ifal.systemifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	private String id;
	
	@Column
	private String disciplina;
	
	@Column
	private String nome;

	public Curso(String id, String disciplina, String nome) {
		super();
		this.id = id;
		this.disciplina = disciplina;
		this.nome = nome;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getdisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", disciplina=" + disciplina + ", nome=" + nome + "]";
	}
	
	
	

}

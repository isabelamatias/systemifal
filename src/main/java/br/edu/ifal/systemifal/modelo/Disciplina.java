package br.edu.ifal.systemifal.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="disciplina")
public class Disciplina {
	
	@Id
	private String id;
	
	@Column
	private String nome;
	
	@OneToMany(mappedBy="disciplina")
	private List <Assunto> assuntos;

	public Disciplina(String id, String nome) {
		super();
		this.id = id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Assunto> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(List<Assunto> assuntos) {
		this.assuntos = assuntos;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
	
	

}

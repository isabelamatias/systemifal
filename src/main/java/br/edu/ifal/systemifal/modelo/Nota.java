package br.edu.ifal.systemifal.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "nota")
public class Nota {
	
	@Id
	private int id;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Disciplina disciplina;
	
	@Column
	private double valor;
	
	private List<Double> notas = new ArrayList<Double>();
	
	public Nota(int id, Aluno aluno, Disciplina disciplina, double valor) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.valor = valor;
	}


	public Nota() {
		super();
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	

			
		


	

}

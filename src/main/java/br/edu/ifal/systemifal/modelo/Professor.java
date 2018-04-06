package br.edu.ifal.systemifal.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor extends Pessoa{
	
	@OneToMany
	private List<Disciplina> disciplinas;
	private CargoProfessor cargoProfessor;
	
	public Professor(String id, String nome) {
		setNome(nome);
		setId(id);
	}

	public Professor() {
		super();
	}
	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Column(name = "cargo_professor", nullable = false)
	@Enumerated(EnumType.STRING)
	public CargoProfessor getCargoProfessor() {
		return cargoProfessor;
	}

	public void setCargoProfessor(CargoProfessor cargoProfessor) {
		this.cargoProfessor = cargoProfessor;
	}
	

}

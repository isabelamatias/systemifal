package br.edu.ifal.systemifal.servico;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Disciplina;
import br.edu.ifal.systemifal.modelo.Nota;
import br.edu.ifal.systemifal.modelo.Professor;


public class RelatorioTest {

	private List<Aluno> alunos;
	private Disciplina disciplina;
	private Professor professor;
	private List<Nota> notas;
	private Relatorio relatorio;
	
	@Before
	public void criacaoDasEntidadesParaTestes() {
		this.alunos = new ArrayList<>();
		this.professor = new Professor ("1","Rafaely");
		this.disciplina = new Disciplina("2","12556","artes");
		this.notas = new ArrayList<Nota>();
		this.relatorio = new Relatorio();
		
		Aluno ana = new Aluno("20","123456","Ana");
		Aluno jose = new Aluno("10","12563","José");
		Aluno tereza = new Aluno("30","158936","Tereza");
		alunos.add(ana);
		alunos.add(jose);
		alunos.add(tereza);
	}
	
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemAleatoria() {
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 9.5));
		notas.add(new Nota(3, alunos.get(2), disciplina, 7.5));
		
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemCrescente() {
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.5));
		notas.add(new Nota(3, alunos.get(2), disciplina, 9.5));
		
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemDecrescente() {
		notas.add(new Nota(1, alunos.get(01), disciplina, 9.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.5));
		notas.add(new Nota(3, alunos.get(2), disciplina, 2.5));
		
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarParaMaiorEMenorNota() {
		notas.add(new Nota(1, alunos.get(0), disciplina, 9.5 ));
		
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 9.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}

}


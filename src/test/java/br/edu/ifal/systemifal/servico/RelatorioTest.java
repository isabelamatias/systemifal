package br.edu.ifal.systemifal.servico;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Disciplina;
import br.edu.ifal.systemifal.modelo.Nota;


public class RelatorioTest {

	@Test
	public void deveFuncionarParaAsNotasNaOrdemAleatoria() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		Aluno ana = new Aluno("20","123456","Ana");
		Aluno jose = new Aluno("10","12563","José");
		Aluno tereza = new Aluno("30","158936","Tereza");
		alunos.add(ana);
		alunos.add(jose);
		alunos.add(tereza);
		
		Disciplina artes = new Disciplina("2","12556","artes");
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1, ana, artes, 2.5));
		notas.add(new Nota(2, jose, artes, 9.5));
		notas.add(new Nota(3, tereza, artes, 7.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemCrescente() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		Aluno ana = new Aluno("20","123456","Ana");
		Aluno jose = new Aluno("10","12563","José");
		Aluno tereza = new Aluno("30","158936","Tereza");
		alunos.add(ana);
		alunos.add(jose);
		alunos.add(tereza);
		
		Disciplina artes = new Disciplina("2","12556","artes");
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1, ana, artes, 2.5));
		notas.add(new Nota(2, jose, artes, 7.5));
		notas.add(new Nota(3, tereza, artes, 9.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemDecrescente() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		Aluno ana = new Aluno("20","123456","Ana");
		Aluno jose = new Aluno("10","12563","José");
		Aluno tereza = new Aluno("30","158936","Tereza");
		alunos.add(ana);
		alunos.add(jose);
		alunos.add(tereza);
		
		Disciplina artes = new Disciplina("2","12556","artes");
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1, ana, artes, 9.5));
		notas.add(new Nota(2, jose, artes, 7.5));
		notas.add(new Nota(3, tereza, artes, 2.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarParaMaiorEMenorNota() {
		List<Aluno> aluno = new ArrayList<Aluno>();
		
		
		Aluno ana = new Aluno("20","123456","Ana");
		aluno.add(ana);
		
		
		Disciplina artes = new Disciplina("2","12556","artes");
		
		List<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1, ana, artes, 9.5 ));
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 9.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}

}

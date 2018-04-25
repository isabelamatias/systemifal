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
	public void criacaoDasEntidadesParaOsTestes() {
		
		this.alunos = new ArrayList<Aluno>();
		this.professor = new Professor(2,"1223", "Célia");
		this.disciplina = new Disciplina("2","artes");
		this.notas = new ArrayList<Nota>();
		this.relatorio = new Relatorio ();
		
		Aluno ana = new Aluno(20,"123456","Ana");
		Aluno jose = new Aluno(10,"12563","José");
		Aluno tereza = new Aluno(30,"158936","Tereza");
		Aluno maria = new Aluno (15, "145235", "Maria"); 
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

 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarParaMaiorEMenorNota() {
		notas.add(new Nota(1, alunos.get(0), disciplina, 9.5 ));
	}
		
	public void deveFuncionarParaMaiorEMenorNotaDeUmUnicoAluno() {
		
		
		
		
		
		notas.add(new Nota(1, alunos.get(0),disciplina, 9.5 ));
		
		
		relatorio.gerar(notas);
 
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 9.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
		
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotas () {
		
		
		
		
		
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.5));
		notas.add(new Nota(3, alunos.get(2), disciplina, 9.5));
		
		
		relatorio.gerar(notas);
 
	
		int quantidaDeNotasEsperadas = 3;
		double primeiraNotaEsperada = 9.5;
		double segundaNotaEsperada = 7.5;
		double terceiraNotaEsperada = 2.5;
		
		assertEquals(quantidaDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(), 000.1);
		
		
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComNenhumaNota () {
		
		
		
		relatorio.gerar(notas);
		
		int quantidaDeNotasEsperadas = 0;
		
		assertEquals(quantidaDeNotasEsperadas, relatorio.getTop3Notas().size()); 
		
		

	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComUmaUnicaNota () {

		
		
		

		
		
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		
		
		relatorio.gerar(notas);
 
	
		int quantidaDeNotasEsperadas = 1;
		double primeiraNotaEsperada = 2.5;
	}

	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComDuasNotas () {
		
		

		
		
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.5));
		
		
		relatorio.gerar(notas);
		
		int quantidaDeNotasEsperadas = 2;
		double primeiraNotaEsperada = 7.5;
		double segundaNotaEsperada = 2.5;
		
		assertEquals(quantidaDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
		
		}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComQuatroNotas () {
		
		
		
		
		
		notas.add(new Nota(1, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(2, alunos.get(1), disciplina, 9.5));
		notas.add(new Nota(3, alunos.get(2), disciplina, 7.5));
		notas.add(new Nota(4, alunos.get(3), disciplina, 8.5));
		
		
		relatorio.gerar(notas);
		
		int quantidaDeNotasEsperadas = 3;
		double primeiraNotaEsperada = 9.5;
		double segundaNotaEsperada = 8.5;
		double terceiraNotaEsperada = 7.5;
		
		
		assertEquals(quantidaDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(), 000.1);
		
	}
}


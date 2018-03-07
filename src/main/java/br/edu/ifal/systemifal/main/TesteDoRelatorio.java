package br.edu.ifal.systemifal.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Disciplina;
import br.edu.ifal.systemifal.modelo.Nota;
import br.edu.ifal.systemifal.servico.Relatorio;

public class TesteDoRelatorio {

	public static void main(String[] args) {
		
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
		
		System.out.println(relatorio.getMaiorNota()== maiorNotaEsperada);
		System.out.println(relatorio.getMenorNota()== menorNotaEsperada);
	}

}

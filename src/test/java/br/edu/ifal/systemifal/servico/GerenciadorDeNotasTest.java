package br.edu.ifal.systemifal.servico;

import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Disciplina;
import br.edu.ifal.systemifal.modelo.Nota;
import br.edu.ifal.systemifal.modelo.Professor;

public class GerenciadorDeNotasTest {
	
	@Test
	public void naoDevePermitirUmaNotaMaiorQueDez() {
		Disciplina disciplina = new Disciplina("22","POO");
		Aluno aluno = new Aluno("000.000.000-89", "Paulo");
		GerenciadorDeNotas gerenciador = new GerenciadorDeNotas();
		boolean resultado = gerenciador.setarNota(20, aluno, disciplina);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
		
		
	}
		
	/*	
	@Test	
	public void naoDevePermitirUmaNotaMenorQueZero() {
		Disciplina disciplina = new Disciplina("33","Interface de Usuário");
	}*/
	

}

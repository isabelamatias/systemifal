package br.edu.ifal.systemifal.main;

import br.edu.ifal.systemifal.dao.AlunoDAO;
import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Professor;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("12", "1111", "Bruna da Silva");
		
		
		//Professor p = new Professor();
		
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);
		
		
	
	}
	
		

}

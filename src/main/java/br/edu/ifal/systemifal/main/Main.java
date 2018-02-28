package br.edu.ifal.systemifal.main;

import br.edu.ifal.systemifal.dao.AlunoDAO;
import br.edu.ifal.systemifal.modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("10", "13254", "Zezinho da Silva");
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);
		
	
	}

}

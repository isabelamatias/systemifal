package br.edu.ifal.systemifal.main;

import br.edu.ifal.systemifal.dao.AlunoDAO;
import br.edu.ifal.systemifal.dao.ProfessorDAO;
import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Professor;

public class Main {

	public static void main(String[] args) {
		
		Professor professor = new Professor(1,"Priscylla","1258963825");
		ProfessorDAO dao = new ProfessorDAO();
		dao.salvar(professor);
		
		
		

	}
	
	
	
		

}
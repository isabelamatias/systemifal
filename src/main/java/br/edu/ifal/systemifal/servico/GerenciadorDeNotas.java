package br.edu.ifal.systemifal.servico;

import br.edu.ifal.systemifal.modelo.Aluno;
import br.edu.ifal.systemifal.modelo.Disciplina;
import br.edu.ifal.systemifal.modelo.Nota;

public class GerenciadorDeNotas {
	
	public boolean setarNota(double valor, Aluno aluno, Disciplina disciplina) {
		if(valor > 0 || valor <= 10 ) {
			Nota nota = new Nota();
			nota.setAluno(aluno);
			nota.setDisciplina(disciplina);
			nota.adiconarNota(valor);
			return true;
		}
		else {
			return false;
		}
	}

}

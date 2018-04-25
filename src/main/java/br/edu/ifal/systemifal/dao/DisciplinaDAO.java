package br.edu.ifal.systemifal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.systemifal.modelo.Disciplina;

public class DisciplinaDAO implements DAOInterface<Disciplina, String>{
	
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public  DisciplinaDAO () {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public void iniciarConexao() {
		em = factory.createEntityManager();
		em.getTransaction().begin();
	}
	
	public void fecharConexao() {
		em.getTransaction().commit();
		em.close();
	}
	
	
	public void salvar(Disciplina disciplina) {
		iniciarConexao();
		em.persist(disciplina);
		fecharConexao();
		
		
	}

	public void atualizar(Disciplina disciplina) {
		iniciarConexao();
		em.merge(disciplina);
		fecharConexao();
		
	}

	public Disciplina buscarPorId(String id) {
		iniciarConexao();
		/// código para buscar um aluno
		fecharConexao();
		return null;
	}

	public void remove(Disciplina disciplina) {
		iniciarConexao();
		em.remove(disciplina);
		fecharConexao();
	}

	public List<Disciplina> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removerTodos() {
		// TODO Auto-generated method stub
		
	}

	
	

	

}

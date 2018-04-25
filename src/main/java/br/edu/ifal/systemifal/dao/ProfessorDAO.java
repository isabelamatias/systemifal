package br.edu.ifal.systemifal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import br.edu.ifal.systemifal.modelo.Professor;

public class ProfessorDAO implements DAOInterface<Professor, String>{
	
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public ProfessorDAO() {
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
	
	@Transactional
	public void salvar(Professor professor) {
		iniciarConexao();
		em.persist(professor);
		fecharConexao();
		
		
	}

	public void atualizar(Professor professor) {
		iniciarConexao();
		em.merge(professor);
		fecharConexao();
		
	}

	public Professor buscarPorId(String id) {
		iniciarConexao();
		Professor professor = em.find(Professor.class, id);
		fecharConexao();
		return professor;
	}

	@Transactional
	public void removeProfessor(Professor professor) {
		iniciarConexao();
		Professor professor2 = em.merge(professor);
		em.remove(professor2);
		fecharConexao();
	}

	public List<Professor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removerTodos() {
		// TODO Auto-generated method stub
		
	}

	public void remove(Professor entity) {
		// TODO Auto-generated method stub
		
	}


}

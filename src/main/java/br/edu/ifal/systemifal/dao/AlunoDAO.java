package br.edu.ifal.systemifal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import br.edu.ifal.systemifal.modelo.Aluno;

public class AlunoDAO implements DAOInterface<Aluno, String> {
	
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public AlunoDAO() {
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
	public void salvar(Aluno aluno) {
		iniciarConexao();
		em.persist(aluno);
		fecharConexao();
		
		
	}

	public void atualizar(Aluno aluno) {
		iniciarConexao();
		em.merge(aluno);
		fecharConexao();
		
	}

	public Aluno buscarPorId(String id) {
		iniciarConexao();
		Aluno aluno = em.find(Aluno.class, Integer.parseInt(id));
		fecharConexao();
		return aluno;
	}

	@Transactional
	public void remove(Aluno aluno) {
		iniciarConexao();
		Aluno aluno2 = em.merge(aluno);
		em.remove(aluno2);
		fecharConexao();
	}

	public List<Aluno> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removerTodos() {
		// TODO Auto-generated method stub
		
	}

	
		
	

}

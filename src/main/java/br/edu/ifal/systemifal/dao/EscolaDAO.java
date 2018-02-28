package br.edu.ifal.systemifal.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.edu.ifal.systemifal.modelo.Escola;

public class EscolaDAO implements DAOInterface<Escola, String>{
	
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public EscolaDAO() {
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
	
	public void salvar(Escola escola) {
		iniciarConexao();
		em.persist(escola);
		fecharConexao();
	}

	public void atualizar(Escola escola) {
		iniciarConexao();
		em.merge(escola);
		fecharConexao();
	}

	public Escola buscarPorId(String id) {
		iniciarConexao();
		Escola escola = em.find(Escola.class, id);
		fecharConexao();
		return escola;
	}

	public void deletar(Escola escola) {
		iniciarConexao();
		em.remove(escola);
		fecharConexao();
	}

	public List<Escola> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}

}

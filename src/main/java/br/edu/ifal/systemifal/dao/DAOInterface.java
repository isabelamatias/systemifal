package br.edu.ifal.systemifal.dao;

import java.io.Serializable;
import java.util.List;



public interface DAOInterface<T, Id extends Serializable> {
	
	public void salvar(T entity);
	public void atualizar(T entity);
	public  T buscarPorId(Id id);
	public void remover(T entity);
	public List<T> buscarTodos();
	public void removerTodos();
	
	

}

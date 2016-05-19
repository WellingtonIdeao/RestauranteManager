package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PadraoDAO;
import model.EntityGeneric;

@Service
@Transactional
public abstract class AbstractService<T extends EntityGeneric> {
	//public static EntityManagerFactory fac = Persistence.createEntityManagerFactory("Restaurante");
	
//	@Autowired
//	protected PadraoDAO<T> dao;
//	
//	public abstract void inserir(T entity) throws Exception;
//	public abstract boolean atualizar(T entity);
//	
//	public boolean remover(T entity) {
//		manager = fac.createEntityManager();
//		boolean ret = false;
//		try {
//
//			// se entidade for nula
//			if (entity == null) {
//				throw new Exception("Entidade passada para remo��o � nula");
//
//			} else
//				entity = dao.buscarPorId(entity.getId());
//
//			// se entidade n�o estiver BD
//			if (entity == null)
//				throw new Exception("Entidade passada para remo��o n�o encontrada");
//
//			dao.remover(entity);
//			manager.getTransaction().begin();
//			manager.getTransaction().commit();
//			ret = true;
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			if (manager.getTransaction().isActive())
//				manager.getTransaction().rollback();
//		} finally {
//			manager.close();
//		}
//		return ret;
//	}
//
//	public List<T> listar() {
//		manager = fac.createEntityManager();
//		List<T> list = null;
//		try {
//			list = dao.listar();
//
//			// se a lista for vazia
//			if (list.isEmpty())
//				throw new Exception("Lista est� vazia");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			if (manager.getTransaction().isActive())
//				manager.getTransaction().rollback();
//		} finally {
//			manager.close();
//		}
//		return list;
//	}
//
//	public T buscar(T entity) {
//		manager = fac.createEntityManager();
//		T ent = entity;
//		try {
//
//			// se entidade for nula
//			if (entity == null)
//				throw new Exception("Entidade passada para busca � nula");
//			else
//				entity = dao.buscarPorId(entity.getId());
//
//			// se entidade n�o estiver no BD
//			if (entity == null)
//				throw new Exception(simpleName(ent) + " n�o encontrado");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			manager.close();
//		}
//		return entity;
//	}
//
//	public String simpleName(T entity) {
//		return entity.getClass().getSimpleName();
//
//	}

}
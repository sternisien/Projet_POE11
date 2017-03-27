package dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.NationDao;
import entities.Nation;

@Repository("nationDao")
@Transactional
public class NationDaoImpl implements NationDao {
	
    @Autowired
    private SessionFactory sessionFactory;
	
	public NationDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * Insert l'entité Nation en base de données
	 * 
	 * @see NationDao
	 * @param nation {@link Nation} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void insert(Nation nation) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.save(nation);
			session.getTransaction().commit();
		}
		catch (RuntimeException transactionEx) {
			session.getTransaction().rollback();
		    throw transactionEx;
		}
		finally {
			session.close();
		}	
	}
	
	/**
	 * Mise à jour de l'entité Nation en base de données
	 * 
	 * @see NationDao
	 * @param nation {@link Nation} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void update(Nation nation) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.update(nation);
			session.getTransaction().commit();
		}
		catch (RuntimeException transactionEx) {
			session.getTransaction().rollback();
		    throw transactionEx;
		}
		finally {
			session.close();
		}			
	}

	/**
	 * Suppression de l'entité Nation en base de données
	 * 
	 * @see NationDao
	 * @param nation {@link Nation} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void delete(Nation nation) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.delete(nation);
			session.getTransaction().commit();
		}
		catch (RuntimeException transactionEx) {
			session.getTransaction().rollback();
		    throw transactionEx;
		}
		finally {
			session.close();
		}		
	}

	/**
	 * Récupération de toute les entités Nation en base de données
	 * 
	 * @see NationDao
	 * @return {@link List} < {@link Nation} >
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	@SuppressWarnings("unchecked")
	public List<Nation> selectAll(){
		
		Session session = sessionFactory.openSession();
		List<Nation> lstNations = new ArrayList<Nation>();
				
		try {
			session.getTransaction().begin();
			Criteria criteria = session.createCriteria(Nation.class);
			lstNations = (List<Nation>) criteria.list();
			session.getTransaction().commit();
		}
		catch (RuntimeException transactionEx) {
			session.getTransaction().rollback();
		    throw transactionEx;
		}
		finally {
			session.close();
		}	
		
		return lstNations;
	}

}

package dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.JoueurDao;
import entities.Joueur;

/**
 * Classe de persistence de donn�es des entit�s {@link Joueur}
 * 
 * @see JoueurDao
 */
@Repository("joueurDao")
@Transactional
public class JoueurDaoImpl implements JoueurDao{
	
    @Autowired
    private SessionFactory sessionFactory;
	
	public JoueurDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * Insert l'entit� Joueur en base de donn�es
	 * 
	 * @see JoueurDao
	 * @param joueur {@link Joueur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'�chec de la transaction
	 */
	public void insert(Joueur joueur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.save(joueur);
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
	 * Mise � jour de l'entit� Joueur en base de donn�es
	 * 
	 * @see JoueurDao
	 * @param joueur {@link Joueur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'�chec de la transaction
	 */
	public void update(Joueur joueur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.update(joueur);
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
	 * Suppression de l'entit� Joueur en base de donn�es
	 * 
	 * @see JoueurDao
	 * @param joueur {@link Joueur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'�chec de la transaction
	 */
	public void delete(Joueur joueur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.delete(joueur);
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
	 * R�cup�ration de toute les entit�s Joueur en base de donn�es
	 * 
	 * @see JoueurDao
	 * @return {@link List} < {@link Joueur} >
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'�chec de la transaction
	 */
	@SuppressWarnings("unchecked")
	public List<Joueur> selectAll(){
		
		Session session = sessionFactory.openSession();
		List<Joueur> lstJoueurs = new ArrayList<Joueur>();
				
		try {
			session.getTransaction().begin();
			Criteria criteria = session.createCriteria(Joueur.class);
			lstJoueurs = (List<Joueur>) criteria.list();
			session.getTransaction().commit();
		}
		catch (RuntimeException transactionEx) {
			session.getTransaction().rollback();
		    throw transactionEx;
		}
		finally {
			session.close();
		}	
		
		return lstJoueurs;
	}
	
}

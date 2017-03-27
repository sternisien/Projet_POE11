package dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.JoueurDao;
import dao.OrganisateurDao;
import entities.Organisateur;

/**
 * Classe de persistence de données des entités {@link Organisateur}
 * 
 * @see JoueurDao
 */
@Repository("organisateurDao")
@Transactional
public class OrganisateurDaoImpl implements OrganisateurDao {
    
    @Autowired
    private SessionFactory sessionFactory;
	
	public OrganisateurDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * Insert l'entité organisateur en base de données
	 * 
	 * @see OrganisateurDao
	 * @param organisateur {@link Organisateur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void insert(Organisateur organisateur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.save(organisateur);
			session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		session.close();
	}

	/**
	 * Mise à jour de l'entité organisateur en base de données
	 * 
	 * @see OrganisateurDao
	 * @param organisateur {@link Organisateur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void update(Organisateur organisateur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.update(organisateur);
			session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		session.close();
		
	}

	/**
	 * Suppression de l'entité organisateur en base de données
	 * 
	 * @see OrganisateurDao
	 * @param organisateur {@link Organisateur} 
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	public void delete(Organisateur organisateur) {
		
		Session session = sessionFactory.openSession();
		
		try {
			session.getTransaction().begin();
			session.delete(organisateur);
			session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}		
		session.close();		
	}

	/**
	 * Récupération de toute les entités Organisateur en base de données
	 * 
	 * @see OrganisateurDao
	 * @return {@link List} < {@link Organisateur} >
	 * @throws transactionEx {@link RuntimeException} : Exception en cas d'échec de la transaction
	 */
	@SuppressWarnings("unchecked")
	public List<Organisateur> selectAll() {
		
		Session session = sessionFactory.openSession();
		List<Organisateur> lstOrganisateurs = new ArrayList<Organisateur>();
				
		try {
			session.getTransaction().begin();
			Criteria criteria = session.createCriteria(Organisateur.class);
			lstOrganisateurs = (List<Organisateur>) criteria.list();
			session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}
		session.close();
		
		return lstOrganisateurs;
	}
	
	/**
	 * Vérifie l'existance de l'organisateur via son pseudo et la correspondance de son mot de passe en base de données
	 * 
	 * @param pseudo {@link String}
	 * @param password {@link String}
	 * @return {@link Organisateur} si authorisé sinon {@link null}
	 */
	public Organisateur isAuthorizedToConnect(String pseudo, String password) {
				
		Session session = sessionFactory.openSession();
		Organisateur organisateur = null;
				
		try {
			session.getTransaction().begin();
			Criteria pseudoMatch = session.createCriteria(Organisateur.class);
			pseudoMatch.add(Restrictions.ilike("pseudo", pseudo));
			organisateur = (Organisateur) pseudoMatch.uniqueResult();	
			session.getTransaction().commit();
		}
		catch (RuntimeException e) {
			session.getTransaction().rollback();
		    throw e;
		}		
		session.close();
		
		if(organisateur == null) {
			//TODO throws utilisateur non enregistr�
		} else if (password.equals(organisateur.getPassword())) {
			//TODO throws le mot de passe ne correspond pas
		}
		
		return organisateur;
	}

}

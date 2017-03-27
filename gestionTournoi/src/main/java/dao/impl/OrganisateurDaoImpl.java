package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.OrganisateurDao;
import entities.Organisateur;

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

	public List<Organisateur> selectAll() {
		
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Criteria criteria = session.createCriteria(Organisateur.class);
		List<Organisateur> lstOrganisateurs = (List<Organisateur>) criteria.list();
		session.getTransaction().commit();
		session.close();
		
		return lstOrganisateurs;
	}
	
	public Organisateur isAuthorizedToConnect(String pseudo, String password) {
				
		Session session = sessionFactory.openSession();
	
		session.getTransaction().begin();
		
		Criteria pseudoMatch = session.createCriteria(Organisateur.class);
		pseudoMatch.add(Restrictions.ilike("pseudo", pseudo));
		Organisateur organisateur = (Organisateur) pseudoMatch.uniqueResult();	
		session.getTransaction().commit();
		session.close();
		
		if(organisateur != null) {
			//TODO throws utilisateur non enregistré
		} else if (password.equals(organisateur.getPassword())) {
			//TODO throws le mot de passe ne correspond pas
		}
		
		return organisateur;
	}

}

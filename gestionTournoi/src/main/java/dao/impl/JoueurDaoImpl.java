package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.JoueurDao;
import entities.Joueur;

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
	
	@Override
	public void insert(Joueur joueur) {
		/*
		sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
		session.persist(joueur);
		session.close();
		*/
	}
	
	@Override
	public void update(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Joueur> selectAll(){
		
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Criteria criteria = session.createCriteria(Joueur.class);
		List<Joueur> lstJoueurs = (List<Joueur>) criteria.list();
		session.getTransaction().commit();
		session.close();
		
		return lstJoueurs;
	}
	
}

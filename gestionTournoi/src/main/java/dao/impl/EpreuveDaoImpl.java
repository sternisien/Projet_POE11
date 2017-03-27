package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.EpreuveDao;
import entities.Epreuve;

@Repository("epreuveDao")
@Transactional
public class EpreuveDaoImpl implements EpreuveDao {
	
    @Autowired
    private SessionFactory sessionFactory;
	
	public EpreuveDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insert(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	public void update(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	public List<Epreuve> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

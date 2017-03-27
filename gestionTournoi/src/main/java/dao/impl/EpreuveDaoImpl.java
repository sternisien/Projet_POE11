package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.EpreuveDao;
import entities.Epreuve;

@Repository("epreuveDao")
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
	
	@Override
	public void insert(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Epreuve epreuve) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Epreuve> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

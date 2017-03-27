package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.ArbitreDao;
import entities.Arbitre;

@Repository("arbitreDao")
public class ArbitreDaoImpl implements ArbitreDao {
	
    @Autowired
    private SessionFactory sessionFactory;
	
	public ArbitreDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insert(Arbitre arbitre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Arbitre arbitre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Arbitre arbitre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Arbitre> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

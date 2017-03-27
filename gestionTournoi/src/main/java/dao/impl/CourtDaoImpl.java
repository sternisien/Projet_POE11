package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.CourtDao;
import entities.Court;

@Repository("courtDao")
public class CourtDaoImpl implements CourtDao {
	
    @Autowired
    private SessionFactory sessionFactory;
	
	public CourtDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insert(Court court) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Court court) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Court court) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Court> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

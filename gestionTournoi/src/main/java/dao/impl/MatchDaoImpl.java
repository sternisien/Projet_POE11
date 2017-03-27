package dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.MatchDao;
import entities.MatchTennis;

@Repository("matchDao")
public class MatchDaoImpl implements MatchDao {
    
    @Autowired
    private SessionFactory sessionFactory;
	
	public MatchDaoImpl() {
		super();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void insert(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MatchTennis> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

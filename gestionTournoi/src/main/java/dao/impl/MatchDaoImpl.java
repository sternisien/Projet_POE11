package dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.MatchDao;
import entities.MatchTennis;

@Repository("matchDao")
@Transactional
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
	
	public void insert(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	public void update(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	public void delete(MatchTennis matchTennis) {
		// TODO Auto-generated method stub
		
	}

	public List<MatchTennis> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

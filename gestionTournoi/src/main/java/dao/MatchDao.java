package dao;

import java.util.List;

import entities.MatchTennis;

public interface MatchDao {

	void insert(MatchTennis matchTennis);
	void update(MatchTennis matchTennis);
	void delete(MatchTennis matchTennis);
	List<MatchTennis> selectAll();
}

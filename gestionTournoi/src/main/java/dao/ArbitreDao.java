package dao;

import java.util.List;

import entities.Arbitre;

public interface ArbitreDao {

	void insert(Arbitre arbitre);
	void update(Arbitre arbitre);
	void delete(Arbitre arbitre);
	List<Arbitre> selectAll();
}

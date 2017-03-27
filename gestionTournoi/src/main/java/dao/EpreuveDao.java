package dao;

import java.util.List;

import entities.Epreuve;

public interface EpreuveDao {
	
	void insert(Epreuve epreuve);
	void update(Epreuve epreuve);
	void delete(Epreuve epreuve);
	List<Epreuve> selectAll();
}

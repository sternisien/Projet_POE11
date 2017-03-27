package dao;

import java.util.List;

import entities.Joueur;

public interface JoueurDao {

	void insert(Joueur joueur);
	void update(Joueur joueur);
	void delete(Joueur joueur);
	List<Joueur> selectAll();
}

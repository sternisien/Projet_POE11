package dao;

import java.util.List;

import entities.Organisateur;

public interface OrganisateurDao {

	void insert(Organisateur organisateur);
	void update(Organisateur organisateur);
	void delete(Organisateur organisateur);
	List<Organisateur> selectAll();
	Organisateur isAuthorizedToConnect(String pseudo, String password);
}

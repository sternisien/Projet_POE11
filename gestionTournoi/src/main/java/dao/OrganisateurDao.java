package dao;

import java.util.List;

import entities.Organisateur;

/**
 *  Interface de persistence d'organisateurs
 */
public interface OrganisateurDao {

	/**
	 * Insert l'organisateur en base de donn�es
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Organisateur organisateur);
	
	/**
	 * Mise � jour de l'organisateur en base de donn�es
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Organisateur organisateur);
	
	/**
	 * Suppression de l'organisateur en base de donn�es
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Organisateur organisateur);
	
	/**
	 * R�cup�ration de tous les organisateurs en base de donn�es
	 * 
	 * @return {@link List} < {@link Organisateur} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Organisateur> selectAll();
	
	/**
	 * V�rifie l'existance de l'organisateur via son pseudo et la correspondance de son mot de passe en base de donn�es
	 * 
	 * @param pseudo {@link String}
	 * @param password {@link String}
	 * @return {@link Organisateur} si authoris� sinon {@link null}
	 */
	Organisateur isAuthorizedToConnect(String pseudo, String password);
}
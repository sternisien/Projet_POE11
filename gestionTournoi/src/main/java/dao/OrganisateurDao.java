package dao;

import java.util.List;

import entities.Organisateur;

/**
 *  Interface de persistence d'organisateurs
 */
public interface OrganisateurDao {

	/**
	 * Insert l'organisateur en base de données
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Organisateur organisateur);
	
	/**
	 * Mise à jour de l'organisateur en base de données
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Organisateur organisateur);
	
	/**
	 * Suppression de l'organisateur en base de données
	 * 
	 * @param organisateur {@link Organisateur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Organisateur organisateur);
	
	/**
	 * Récupération de tous les organisateurs en base de données
	 * 
	 * @return {@link List} < {@link Organisateur} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Organisateur> selectAll();
	
	/**
	 * Vérifie l'existance de l'organisateur via son pseudo et la correspondance de son mot de passe en base de données
	 * 
	 * @param pseudo {@link String}
	 * @param password {@link String}
	 * @return {@link Organisateur} si authorisé sinon {@link null}
	 */
	Organisateur isAuthorizedToConnect(String pseudo, String password);
}
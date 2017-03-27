package dao;

import java.util.List;

import entities.Joueur;

/**
 *  Interface de persistence de joueurs
 */
public interface JoueurDao {

	/**
	 * Insert le joueur en base de données
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Joueur joueur);
	
	/**
	 * Mise à jour du joueur en base de données
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Joueur joueur);
	
	/**
	 * Suppression du joueur en base de données
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Joueur joueur);
	
	/**
	 * Récupération de tous les joueurs en base de données
	 * 
	 * @return {@link List} < {@link Joueur} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Joueur> selectAll();
}

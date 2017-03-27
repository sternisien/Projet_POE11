package dao;

import java.util.List;

import entities.Joueur;

/**
 *  Interface de persistence de joueurs
 */
public interface JoueurDao {

	/**
	 * Insert le joueur en base de donn�es
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Joueur joueur);
	
	/**
	 * Mise � jour du joueur en base de donn�es
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Joueur joueur);
	
	/**
	 * Suppression du joueur en base de donn�es
	 * 
	 * @param joueur {@link Joueur}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Joueur joueur);
	
	/**
	 * R�cup�ration de tous les joueurs en base de donn�es
	 * 
	 * @return {@link List} < {@link Joueur} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Joueur> selectAll();
}

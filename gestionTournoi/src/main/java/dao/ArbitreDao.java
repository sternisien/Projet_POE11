package dao;

import java.util.List;

import entities.Arbitre;

/**
 *  Interface de persistence d'arbitres
 */
public interface ArbitreDao {

	/**
	 * Insert l'arbitre en base de données
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Arbitre arbitre);
	
	/**
	 * Mise à jour de l'arbitre en base de données
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Arbitre arbitre);
	
	/**
	 * Suppression de l'arbitre en base de données
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Arbitre arbitre);
	
	/**
	 * Récupération de tous les arbitres en base de données
	 * 
	 * @return {@link List} < {@link Arbitre} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Arbitre> selectAll();
}

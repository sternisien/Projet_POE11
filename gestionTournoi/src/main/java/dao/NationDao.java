package dao;

import java.util.List;

import entities.Nation;

/**
 * Interface de persistence de nations
 */
public interface NationDao {

	/**
	 * Insert la nation en base de données
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Nation nation);

	/**
	 * Mise à jour de la nation en base de données
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Nation nation);

	/**
	 * Suppression de la nation en base de données
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Nation nation);

	/**
	 * Récupération de toutes les nations en base de données
	 * 
	 * @return {@link List} < {@link Nation} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Nation> selectAll();
}

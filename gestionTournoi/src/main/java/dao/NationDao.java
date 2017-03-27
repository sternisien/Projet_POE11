package dao;

import java.util.List;

import entities.Nation;

/**
 * Interface de persistence de nations
 */
public interface NationDao {

	/**
	 * Insert la nation en base de donn�es
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Nation nation);

	/**
	 * Mise � jour de la nation en base de donn�es
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Nation nation);

	/**
	 * Suppression de la nation en base de donn�es
	 * 
	 * @param nation {@link Nation}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Nation nation);

	/**
	 * R�cup�ration de toutes les nations en base de donn�es
	 * 
	 * @return {@link List} < {@link Nation} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Nation> selectAll();
}

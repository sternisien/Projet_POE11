package dao;

import java.util.List;

import entities.Court;

/**
 *  Interface de persistence de courts
 */
public interface CourtDao {

	/**
	 * Insert un court en base de données
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Court court);
	
	/**
	 * Mise à jour du court en base de données
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Court court);
	
	/**
	 * Suppression du court en base de données
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Court court);
	
	/**
	 * Récupération de tous les courts en base de données
	 * 
	 * @return {@link List} < {@link Court} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Court> selectAll();
}

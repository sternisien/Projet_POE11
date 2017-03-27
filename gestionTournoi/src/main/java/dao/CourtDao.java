package dao;

import java.util.List;

import entities.Court;

/**
 *  Interface de persistence de courts
 */
public interface CourtDao {

	/**
	 * Insert un court en base de donn�es
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Court court);
	
	/**
	 * Mise � jour du court en base de donn�es
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Court court);
	
	/**
	 * Suppression du court en base de donn�es
	 * 
	 * @param court {@link Court}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Court court);
	
	/**
	 * R�cup�ration de tous les courts en base de donn�es
	 * 
	 * @return {@link List} < {@link Court} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Court> selectAll();
}

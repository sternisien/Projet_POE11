package dao;

import java.util.List;

import entities.Arbitre;

/**
 *  Interface de persistence d'arbitres
 */
public interface ArbitreDao {

	/**
	 * Insert l'arbitre en base de donn�es
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Arbitre arbitre);
	
	/**
	 * Mise � jour de l'arbitre en base de donn�es
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Arbitre arbitre);
	
	/**
	 * Suppression de l'arbitre en base de donn�es
	 * 
	 * @param arbitre {@link Arbitre}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Arbitre arbitre);
	
	/**
	 * R�cup�ration de tous les arbitres en base de donn�es
	 * 
	 * @return {@link List} < {@link Arbitre} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Arbitre> selectAll();
}

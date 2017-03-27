package dao;

import java.util.List;

import entities.Epreuve;

/**
 *  Interface de persistence d'�preuves
 */
public interface EpreuveDao {
	
	/**
	 * Insert l'�preuve en base de donn�es
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(Epreuve epreuve);
	
	/**
	 * Mise � jour de l'�preuve en base de donn�es
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(Epreuve epreuve);
	
	/**
	 * Suppression de l'�preuve en base de donn�es
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(Epreuve epreuve);
	
	/**
	 * R�cup�ration de toutes les �preuves en base de donn�es
	 * 
	 * @return {@link List} < {@link Epreuve} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<Epreuve> selectAll();
}

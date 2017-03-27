package dao;

import java.util.List;

import entities.Epreuve;

/**
 *  Interface de persistence d'épreuves
 */
public interface EpreuveDao {
	
	/**
	 * Insert l'épreuve en base de données
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(Epreuve epreuve);
	
	/**
	 * Mise à jour de l'épreuve en base de données
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(Epreuve epreuve);
	
	/**
	 * Suppression de l'épreuve en base de données
	 * 
	 * @param epreuve {@link Epreuve}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(Epreuve epreuve);
	
	/**
	 * Récupération de toutes les épreuves en base de données
	 * 
	 * @return {@link List} < {@link Epreuve} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<Epreuve> selectAll();
}

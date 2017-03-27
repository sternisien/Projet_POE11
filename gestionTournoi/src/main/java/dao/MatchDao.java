package dao;

import java.util.List;

import entities.MatchTennis;

/**
 *  Interface de persistence de matchs
 */
public interface MatchDao {

	/**
	 * Insert le match en base de données
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void insert(MatchTennis matchTennis);
	
	/**
	 * Mise à jour du match en base de données
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void update(MatchTennis matchTennis);
	
	/**
	 * Suppression du match en base de données
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	void delete(MatchTennis matchTennis);
	
	/**
	 * Récupération de tous les matchs en base de données
	 * 
	 * @return {@link List} < {@link MatchTennis} >
	 * @throws RuntimeException Exception en cas d'échec de la transaction
	 */
	List<MatchTennis> selectAll();
}

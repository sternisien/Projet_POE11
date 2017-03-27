package dao;

import java.util.List;

import entities.MatchTennis;

/**
 *  Interface de persistence de matchs
 */
public interface MatchDao {

	/**
	 * Insert le match en base de donn�es
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void insert(MatchTennis matchTennis);
	
	/**
	 * Mise � jour du match en base de donn�es
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void update(MatchTennis matchTennis);
	
	/**
	 * Suppression du match en base de donn�es
	 * 
	 * @param matchTennis {@link MatchTennis}
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	void delete(MatchTennis matchTennis);
	
	/**
	 * R�cup�ration de tous les matchs en base de donn�es
	 * 
	 * @return {@link List} < {@link MatchTennis} >
	 * @throws RuntimeException Exception en cas d'�chec de la transaction
	 */
	List<MatchTennis> selectAll();
}

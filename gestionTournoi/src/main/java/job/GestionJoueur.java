package job;

import java.util.List;

import entities.Joueur;
import entities.Nation;
import entities.Sexe;

public interface GestionJoueur {

	/**
	 * Permet d'ajouter un joueur dans la BDD
	 * 
	 * @param nom
	 *            de type String
	 * @param prenom
	 *            de type String
	 * @return retourne une chaine de caractère contenant sois: "joueur
	 *         enregistre", sois: "error in registration"
	 */
	public String ajoutJoueur(String nom, String prenom, Nation nation, Sexe sexe);

	public List<Joueur> getLstJoueur();

	
}
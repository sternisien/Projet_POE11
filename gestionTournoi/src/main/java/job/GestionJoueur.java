package job;

import java.util.List;

import entities.Joueur;
import entities.Nation;

public interface GestionJoueur {

	public void ajoutJoueur(String nom, String prenom, Nation nation, String sexe) throws JobException;
	public void modifierJoueur(Integer id) throws JobException;	
	public void supprimerJoueur(Integer id) throws JobException;
	public List<Joueur> getAllJoueurs() throws JobException;
}
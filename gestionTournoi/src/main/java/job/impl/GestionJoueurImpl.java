package job.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.JoueurDao;
import entities.Joueur;
import entities.Nation;
import entities.Sexe;
import job.GestionJoueur;

@Service("gestionJoueur")
public class GestionJoueurImpl implements GestionJoueur {
	
	@Autowired
	JoueurDao joueurDao;
	
	private List<Joueur> lstJoueur;
	
	public GestionJoueurImpl() {
		super();
		lstJoueur = new ArrayList<Joueur>();
	}

	public List<Joueur> getLstJoueur() {
		this.lstJoueur = joueurDao.selectAll();
		return lstJoueur;
	}

	public void setLstJoueur(List<Joueur> lstJoueur) {
		this.lstJoueur = lstJoueur;
	}

	/**
	 * Ajout joueur s'occupe d'ajouter un joueur à la bdd
	 */
	@Override
	public String ajoutJoueur(String nom, String prenom, Nation nation, Sexe sexe) {
		if (isboolVerifierNonNull(nom, prenom)) {
			if(isboolVerifierChampsNonVide(nom, prenom)){
				if(isboolVerifierPasDeCaractereSpe(nom, prenom)){
					Joueur joueur = new Joueur(nom, prenom, sexe.toString(), nation);
					
					joueurDao.insert(joueur);
					return "joueur enregistre";
				}
			}
		}
		return "error in registration";
	}

	/**
	 * Cette fonction permet de vérifier que les informations renseignés ne sont
	 * pas null
	 * 
	 * @param nom
	 * @param prenom
	 * @return boolean
	 */
	public boolean isboolVerifierNonNull(String nom, String prenom) {
		if (nom != null && prenom != null) {
			return true;
		}
		return false;
	}

	/**
	 * Cette méthode vérifie qu'il n'y a que des lettres dans le nom et le
	 * prénom
	 * 
	 * @param nom
	 * @param prenom
	 * @return boolean Si il n'y a que des lettres, return true, sinon return
	 *         false
	 */
	public boolean isboolVerifierPasDeCaractereSpe(String nom, String prenom) {
		//le pattern représente tout ce qui se trouver en dehors de a-zA-Z
		Pattern pattern = Pattern.compile("[^a-zA-Z]");
		// Vérification du nom
		Matcher matcher = pattern.matcher(nom);
		while (matcher.find()) {
			return false;
		}
		// Vérification du prénom
		matcher = pattern.matcher(prenom);
		while (matcher.find()) {
			return false;
		}
		return true;

	}

	/**
	 * Vérifie que les champs nom et prenoms ne sont pas vides
	 * 
	 * @param nom
	 *            de type String
	 * @param prenom
	 *            de type String
	 * @return boolean true si les champs sont renseigné, false si ils sont vide
	 */
	public boolean isboolVerifierChampsNonVide(String nom, String prenom) {
		
		if (nom.equals("") || prenom == "") {
			return false;
		} else {
			return true;
		}
	}
}

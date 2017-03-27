package job.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CourtDao;
import entities.Court;
import job.GestionCourt;

@Service("gestionCourt")
public class GestionCourtImpl implements GestionCourt{

	@Autowired
	CourtDao courtDao;
	

	public GestionCourtImpl() {
		super();
	}

	/**
	 * Ajout joueur s'occupe d'ajouter un court � la bdd
	 */
	@Override
	public String ajoutCourt(String nom) {
		if (isboolVerifierNonNull(nom)) {
			if(isboolVerifierChampsNonVide(nom)){
				if(isboolVerifierPasDeCaractereSpe(nom)){
					Court court = new Court(nom);

					courtDao.insert(court);
					return "joueur enregistre";
				}
			}
		}
		return "error in registration";
	}

	/**
	 * Cette fonction permet de v�rifier que les informations renseign�s ne sont
	 * pas null
	 * 
	 * @param nom
	 * @return boolean
	 */
	public boolean isboolVerifierNonNull(String nom) {
		if (nom != null) {
			return true;
		}
		return false;
	}

	/**
	 * Cette m�thode v�rifie qu'il n'y a que des lettres dans le nom
	 * 
	 * @param nom
	 * @return boolean Si il n'y a que des lettres, return true, sinon return
	 *         false
	 */
	public boolean isboolVerifierPasDeCaractereSpe(String nom) {
		//le pattern repr�sente tout ce qui se trouver en dehors de a-zA-Z
		Pattern pattern = Pattern.compile("[^a-zA-Z1-9]");
		// V�rification du nom
		Matcher matcher = pattern.matcher(nom);
		while (matcher.find()) {
			return false;
		}
		return true;

	}

	/**
	 * V�rifie que les champs nom et prenoms ne sont pas vides
	 * 
	 * @param nom
	 *            de type String
	 * @return boolean true si les champs sont renseign�, false si ils sont vide
	 */
	public boolean isboolVerifierChampsNonVide(String nom) {
		
		if (nom.equals("")) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Permet de r�cup�rer la liste des courts pr�sent dans la base de donn�es
	 * 
	 * @return
	 */
	public List<Court> getListCourt() {
		List<Court> listCourt = new ArrayList<Court>();
		
		return listCourt;
	}
}

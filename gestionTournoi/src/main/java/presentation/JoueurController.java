package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Joueur;
import entities.Nation;
import entities.Sexe;
import job.GestionJoueur;
import job.JobException;

@Component
@ManagedBean(name = "joueurController")
@SessionScoped
public class JoueurController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionJoueur gestionJoueur;

	// OUTPUT
	private List<String> lstSexe;
	private List<Nation> lstNation;
	private List<Joueur> lstJoueur;
	
	// INPUT
	private String nom;
	private String prenom;
	private String sexe;
	private String nationalite;
	private int indexNation;
	
	// Liste de messages d'erreur
	private List<String> listErrorMsg = new ArrayList<String>();
	
	// Jumbotron informations
	private String title;
	private String description;
	private String entete;
	

	// *********** Constructor ***********

	public JoueurController() {
		super();

		// Récupération de la liste des joueurs
		/*
		try {
			this.lstJoueur = gestionJoueur.getAllJoueurs();
		} catch (JobException jobEx) {
			this.listErrorMsg.add(jobEx.getMessage());
		}
		*/
		
		// Ajout des genres
		lstSexe = new ArrayList<String>();
		lstSexe.add("HOMME");
		lstSexe.add("FEMME");
		
		lstNation = new ArrayList<Nation>();

		setTitle("Enregistrement d'un nouveau joueur");
		setDescription(
				"Enregistrer un nouveau joueur en indiquant son nom, son prénom," + "son sexe et sa nationalité.");
		setEntete("Liste des joueurs");
	}


	// *********** Setters / Getters ***********

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNationalite() {
		return this.nationalite;
	}

	public void setNationalite(String nation) {
		this.nationalite = nation;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEntete() {
		return entete;
	}

	public void setEntete(String entete) {
		this.entete = entete;
	}

	public List<String> getLstSexe() {
		return lstSexe;
	}

	public void setLstSexe(List<String> lstSexe) {
		this.lstSexe = lstSexe;
	}

	public List<Nation> getLstNation() {
		return lstNation;
	}

	public void setLstNation(List<Nation> lstNation) {
		this.lstNation = lstNation;
	}

	public int getIndexNation() {
		return indexNation;
	}

	public void setIndexNation(int indexNation) {
		this.indexNation = indexNation;
	}

	public List<Joueur> getLstJoueur() {
		return lstJoueur;
	}

	public void setLstJoueur(List<Joueur> lstJoueur) {
		this.lstJoueur = lstJoueur;
	}

	public List<String> getListErrorMsg() {
		return listErrorMsg;
	}


	public void setListErrorMsg(List<String> listErrorMsg) {
		this.listErrorMsg = listErrorMsg;
	}
	

	// *********** Actions ***********

	public String init() {
		return "player";
	}

	public String affichagePageAjoutJoueur() {

		return "player";
	}

	public String traitementJoueur() {
		
		if (Sexe.HOMME.toString().equals(sexe) || Sexe.FEMME.toString().equals(sexe)) {
			try {
				gestionJoueur.ajoutJoueur(this.nom, this.prenom, new Nation(this.nationalite), this.sexe);
			} catch (JobException jobEx) {
				this.listErrorMsg.add(jobEx.getMessage());
			}
		}

		return "player";
	}
	
	public String actualiserListeJoueurs() {
		
		try {
			this.lstJoueur = gestionJoueur.getAllJoueurs();
		} catch (JobException jobEx) {
			this.listErrorMsg.add(jobEx.getMessage());
		}
		
		return "player";
	}

}
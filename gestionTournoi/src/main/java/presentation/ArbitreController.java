package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Arbitre;
import entities.Nation;
import job.GestionArbitre;

@Component
@ManagedBean(name = "arbitreController")
@SessionScoped
public class ArbitreController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionArbitre gestionArbitre;

	private String title;
	private String description;
	private String entete;
	private String nom;
	private String prenom;
	private String niveau;
	private int indexNation;
	private int indexNiveau;
	private List<Nation>lesNations;
	private List<String>lesNiveaux;
	private List<Arbitre> lstArbitres;

	// *********** Constructor ***********

	public ArbitreController() {
		super();
		setTitle("Enregistrement des arbitres");
		setDescription("Enregistrer un nouvel arbitre en indiquant son nom,son "
				+ "prénom, sa nationalité et son niveau(chaise ou ligne).");
		setEntete("Liste des arbitres");
		
		lesNations = new ArrayList<Nation>();
		lesNiveaux = new ArrayList<String>();
		lstArbitres = new ArrayList<Arbitre>();
		lesNiveaux.add("chaise");
		
	}

	public String affichagePageEnregistrerArbitre() {

		return "arbitre";
	}

	// *********** Setters / Getters ***********

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

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

	// *********** Actions ***********

	public String init() {
		return "umpire";
	}

	public String traitementArbitre() {

		// TODO

		return "umpire";
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

	public List<Nation> getLesNations() {
		return lesNations;
	}

	public void setLesNations(List<Nation> lesNations) {
		this.lesNations = lesNations;
	}

	public List<String> getLesNiveaux() {
		return lesNiveaux;
	}

	public void setLesNiveaux(List<String> lesNiveaux) {
		this.lesNiveaux = lesNiveaux;
	}

	public int getIndexNation() {
		return indexNation;
	}

	public void setIndexNation(int indexNation) {
		this.indexNation = indexNation;
	}

	public int getIndexNiveau() {
		return indexNiveau;
	}

	public void setIndexNiveau(int indexNiveau) {
		this.indexNiveau = indexNiveau;
	}

	public List<Arbitre> getLstArbitres() {
		return lstArbitres;
	}

	public void setLstArbitres(List<Arbitre> lstArbitres) {
		this.lstArbitres = lstArbitres;
	}

}

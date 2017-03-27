package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Arbitre;
import entities.Court;
import entities.Epreuve;
import entities.Joueur;
import entities.MatchTennis;
import job.GestionMatch;

@Component
@ManagedBean(name="matchController")
@SessionScoped
public class MatchController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionMatch gestionMatch;

	private Date date;
	private String title;
	private String description;
	private String entete;
	private int indexEpreuve;
	private int indexJoueur1;
	private int indexJoueur2;
	private int indexArbitre;
	private int indexCourt;
	private List<Arbitre>lesArbitres;
	private List<Court>lesCourts;
	private List<Joueur>lesJoueurs;
	private List<Epreuve>lstEpreuves;
	private List<MatchTennis>lesMatchs;
	
	
	//*********** Constructor ***********
	
	public MatchController(){
		super();
		setTitle("Planifier des matchs");
		setDescription("Pour créer un match, sélectionne deux joueurs, un arbitre," + "un court et une date");
		setEntete("Liste des matchs programmés");
		lesCourts = new ArrayList<Court>();
		lesJoueurs = new ArrayList<Joueur>();
		lstEpreuves = new ArrayList<Epreuve>();
		lesMatchs = new ArrayList<MatchTennis>();
	}


	//*********** Setters / Getters ***********
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public List<MatchTennis> getLesMatchs() {
		return lesMatchs;
	}

	public void setLesMatchs(List<MatchTennis> lesMatchs) {
		this.lesMatchs = lesMatchs;
	}

	public int getIndexEpreuve() {
		return indexEpreuve;
	}

	public void setIndexEpreuve(int indexEpreuve) {
		this.indexEpreuve = indexEpreuve;
	}

	public List<Epreuve> getLstEpreuves() {
		return lstEpreuves;
	}

	public void setLstEpreuve(List<Epreuve> lstEpreuves) {
		this.lstEpreuves = lstEpreuves;
	}

	public int getIndexJoueur1() {
		return indexJoueur1;
	}

	public void setIndexJoueur1(int indexJoueur1) {
		this.indexJoueur1 = indexJoueur1;
	}

	public int getIndexJoueur2() {
		return indexJoueur2;
	}

	public void setIndexJoueur2(int indexJoueur2) {
		this.indexJoueur2 = indexJoueur2;
	}

	public List<Joueur> getLesJoueurs() {
		return lesJoueurs;
	}

	public void setLesJoueurs(List<Joueur> lesJoueurs) {
		this.lesJoueurs = lesJoueurs;
	}

	public List<Arbitre> getLesArbitres() {
		return lesArbitres;
	}

	public void setLesArbitres(List<Arbitre> lesArbitres) {
		this.lesArbitres = lesArbitres;
	}

	public List<Court> getLesCourts() {
		return lesCourts;
	}

	public void setLesCourts(List<Court> lesCourts) {
		this.lesCourts = lesCourts;
	}

	public int getIndexArbitre() {
		return indexArbitre;
	}

	public void setIndexArbitre(int indexArbitre) {
		this.indexArbitre = indexArbitre;
	}

	public int getIndexCourt() {
		return indexCourt;
	}

	public void setIndexCourt(int indexCourt) {
		this.indexCourt = indexCourt;
	}
	
	
	//*********** Actions ***********
		
	public String init() {
		return "match";
	}
	
	public String traitement(){
		return "match";
	}


	
}

package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import entities.Sexe;

@Component
@ManagedBean(name="homeController")
@SessionScoped
public class HomeController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	private String description;
	private String entete;
	private List<String> lesJoueurs;
	private List<String> list;
	private List<String> lstSexe;
	
	//*********** Constructor ***********
	
	public HomeController() {
		super();
	}


	//*********** Setters / Getters ***********

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


	public List<String> getLesJoueurs() {
		return lesJoueurs;
	}


	public void setLesJoueurs(List<String> lesJoueurs) {
		this.lesJoueurs = lesJoueurs;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	//*********** Actions ***********
	
	public String init() {
		return "home";
	}
	


	public String affichagePageEnregistrerCourt() {

		title = "Enregistrer des courts";
		description = "Enregistrer un nouveau court en indiquant son nom";
		entete = "Liste des courts";
		return "court";
	}

	public String affichagePagePlanifierMatch() {

		title = "Planifier des matchs";
		description = "Pour créer un match, sélectionne deux joueurs, un arbitre," + "un court et une date";

		lesJoueurs = new ArrayList<String>();

		lesJoueurs.add("toto");
		lesJoueurs.add("toto");

		return "planning";
	}
	
}

package presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import job.GestionArbitre;

@Component
@ManagedBean(name="arbitreController")
@SessionScoped
public class ArbitreController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionArbitre gestionArbitre;
	
	private String nom;
	private String prenom;
	private String niveau;
	private String nation;

	
	//*********** Constructor ***********
	
	public ArbitreController() {
		super();
	}


	//*********** Setters / Getters ***********
	
	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
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
	
	
	//*********** Actions ***********
	
	public String init() {
		return "umpire";
	}
	
	public String traitementArbitre() {
		
		//TODO
		
		return "umpire";
	}

}


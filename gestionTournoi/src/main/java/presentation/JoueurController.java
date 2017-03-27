package presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Nation;
import entities.Sexe;
import job.GestionJoueur;

@Component
@ManagedBean(name="joueurController")
@SessionScoped
public class JoueurController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	GestionJoueur gestionJoueur;
	
	private String 	nom;
	private String 	prenom;
	private String	sexe;
	private String 	nationalite;

	
	//*********** Constructor ***********
	
	public JoueurController() {
		super();
	}
	

	//*********** Setters / Getters ***********
	
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
	
	
	//*********** Actions ***********
	
	public String init() {
		return "player";
	}
	
	public String traitementJoueur(){
		
		if(Sexe.HOMME.toString().equals(sexe) || Sexe.FEMME.toString().equals(sexe)){
			gestionJoueur.ajoutJoueur(this.nom, this.prenom, new Nation(this.nationalite), Sexe.valueOf(this.sexe));
		}
		
		return "player";
	}	
}

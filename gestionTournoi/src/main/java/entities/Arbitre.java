package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * Classe entit� repr�sentant un arbitre
 *
 */
@Entity
@Table(name = "arbitre")
public class Arbitre {
	
	
	public Integer idarbitre;
	
	/**
	 * Instance de {@link String} correspondant au nom d'un arbitre.
	 */

	public String nom;
	
	/**
	 * Instance de {@link String} correspondant au prénom d'un arbitre.
	 */
	
	public String prenom;
	
	/**
	 * Instance de {@link String} correspondant au niveau d'un arbitre.
	 */
	
	public String niveau;
	
	
	public Nation nation;

	public Arbitre(String nom, String prenom, String niveau, Nation nation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
		this.nation = nation;
	}

	public Integer getIdarbitre() {
		return idarbitre;
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

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Nation getNation() {
		return nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

}


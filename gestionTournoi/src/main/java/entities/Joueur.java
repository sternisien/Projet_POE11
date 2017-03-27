package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe entité représentant un Joueur
 * 
 * @class Joueur
 */
@Entity
@Table(name = "joueur")
public class Joueur {

	@Id
	@Column(name = "idjoueur", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer idjoueur;

	/**
	 * Instance de {@link String} correspondant au nom d'un joueur.
	 */
	@Column(name = "nom", length = 50)
	public String nom;

	/**
	 * Instance de {@link String} correspondant au prénom d'un joueur.
	 */
	@Column(name = "prenom", length = 50)
	public String prenom;

	/**
	 * Instance de {@link enum.Sexe} correspondant au genre d'un joueur.
	 */
	public String sexe;

	/**
	 * Instance de {@link Nation} correspondant à la nationnalité  d'un joueur.
	 */
	public Nation nation;

	/**
	 * Constructeur à vide de Joueur
	 */
	public Joueur() {
		super();
	}

	/**
	 * Constructeur de Joueur
	 * 
	 * @param nom
	 *            nom
	 * @param prenom
	 *            prénom
	 * @param sexe
	 *            genre (HOMME / FEMME)
	 * @param nation
	 *            nationnalité
	 */
	public Joueur(String nom, String prenom, String sexe, Nation nation) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
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

	/**
	 * @return Retourne le genre du joueur (HOMME / FEMME)
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * @param sexe Redéfinit le genre du joueur (HOMME / FEMME)
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


}
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organisateur")
public class Organisateur {

	@Id
	@Column(name = "idorganisateur", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idorganisateur;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name = "pseudo", length = 50)
	private String pseudo;
	
	@Column(name = "password", length = 50)
	private String password;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

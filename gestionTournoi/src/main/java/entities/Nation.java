package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nation")
public class Nation {
	
	@Id
	@Column(name = "idnation", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idNation;
	
	/**
	 * Instance de {@link String} correspondant au libel� de la Nation.
	 */
	@Column(name = "libelleNation", length = 50)
	private String 	libelle;
	
	/**
	 * Constructeur � vide de Nation
	 */
	public Nation() {
		super();
	}

	/**
	 * Constructeur de Nation
	 * 
	 * @param libele libel�
	 */
	public Nation(String libelle) {
		super();
		this.libelle = libelle;
	}

	public String getlibelle() {
		return libelle;
	}

	public void setlibelle(String libelle) {
		this.libelle = libelle;
	}
	
}

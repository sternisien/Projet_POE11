package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import job.GestionOrganisateur;

import java.io.Serializable;

@Component
@ManagedBean(name="connectionController")
@RequestScoped
public class ConnectionController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	GestionOrganisateur gestionOrganisateur;

	private String pseudo;
	private String password;

	
	//*********** Constructor ***********
	
	public ConnectionController() {
		super();
	}


	//*********** Setters / Getters ***********
	
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
	
	
	//*********** Actions ***********
		
	public String init() {
		return "connection";
	}
	
	public String traitementConnection() {
		
		//TODO
		/*
		Boolean isAuthorized = false;
		
		isAuthorized = gestionOrganisateur.connection(this.pseudo, this.password);
		
		if(isAuthorized) {
			return "ressources/home";
		} else {
			return "connection";
		}*/
		
		return "ressources/home";
	}
	
	public String deconnection() {

		return "deconnection";
	}
	
}

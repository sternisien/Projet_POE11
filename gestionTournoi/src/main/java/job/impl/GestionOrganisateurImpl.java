package job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrganisateurDao;
import entities.Organisateur;
import job.GestionOrganisateur;

@Service("gestionOrganisateur")
public class GestionOrganisateurImpl implements GestionOrganisateur {

	@Autowired
	OrganisateurDao orgnisateurDao;
	
	public GestionOrganisateurImpl() {
		super();
	}

	public void ajoutOrganisateur(String nom, String pseudo, String password) {
		
		Organisateur organisateur = new Organisateur();
		organisateur.setNom(nom);
		organisateur.setPseudo(pseudo);
		organisateur.setPassword(password);	
		
		orgnisateurDao.insert(organisateur);	
	}

	public Boolean connection(String pseudo, String password) {
		// TODO Auto-generated method stub
		
		Boolean isAuthorized = false;
		
		Organisateur organisateur = orgnisateurDao.isAuthorizedToConnect(pseudo, password);
		
		if(organisateur.getPseudo().equals(pseudo)) {
			isAuthorized = true;
		}
				
		return isAuthorized;
	}

}

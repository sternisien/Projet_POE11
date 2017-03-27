package job.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.JoueurDao;
import entities.Joueur;
import entities.Nation;
import entities.Sexe;
import job.GestionJoueur;
import job.JobException;

@Service("gestionJoueur")
public class GestionJoueurImpl implements GestionJoueur {
	
	@Autowired
	JoueurDao joueurDao;
	
	public GestionJoueurImpl() {
		super();
	}

	public void ajoutJoueur(String nom, String prenom, Nation nation, String sexe) throws JobException {
		
		Joueur joueur = new Joueur();
		joueur.setNom(prenom);
		joueur.setPrenom(prenom);
		joueur.setNation(nation);
				
		joueur.setSexe(Sexe.valueOf(sexe.toUpperCase()));
		
		try {
			joueurDao.insert(joueur);
		} catch (RuntimeException transactionEx) {
			throw new JobException("Le joueur n'a pas pu être ajouté");
		}
	}

	public void modifierJoueur(Integer id) throws JobException {
		
		try {
			// TODO modification du joueur via id
		} catch (RuntimeException transactionEx) {
			throw new JobException("Le joueur n'a pas pu être modifié");
		}
	}

	public void supprimerJoueur(Integer id) throws JobException {
		
		try {
			// TODO suppression du joueur via id
		} catch (RuntimeException transactionEx) {
			throw new JobException("Le joueur n'a pas pu être supprimé");
		}
	}

	public List<Joueur> getAllJoueurs() throws JobException {
		
		List<Joueur> lstJoueur = new ArrayList<Joueur>();
		
		try {
			lstJoueur = joueurDao.selectAll();
		} catch (RuntimeException transactionEx) {
			throw new JobException("La liste des joueurs n'a pas pu être récupérée");
		}
		
		return lstJoueur;
	}
	
}

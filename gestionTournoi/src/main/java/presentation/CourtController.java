package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Court;
import job.GestionCourt;

@Component
@ManagedBean(name = "courtController")
@SessionScoped
public class CourtController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionCourt gestionCourt;

	private String court;
	private String title;
	private String description;
	private String entete;
	private List<Court> lstCourts;

	// *********** Constructor ***********

	public CourtController() {
		super();
		setTitle("Enregistrer des courts");
		setDescription("Enregistrer un nouveau court en indiquant son nom");
		setEntete("Liste des courts");
		lstCourts = new ArrayList<Court>();
	}

	// *********** Setters / Getters ***********

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}
	
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

	public List<Court> getLstCourts() {
		return lstCourts;
	}

	public void setLstCourts(List<Court> lstCourts) {
		this.lstCourts = lstCourts;
	}

	// *********** Actions ***********

	public String init() {
		return "court";
	}

	public String traitementCourt() {

		return "court";
	}


	
	

}

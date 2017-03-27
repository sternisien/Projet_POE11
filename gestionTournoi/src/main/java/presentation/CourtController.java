package presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import job.GestionCourt;

@Component
@ManagedBean(name = "courtController")
@SessionScoped
public class CourtController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionCourt gestionCourt;

	private String court;

	
	// *********** Constructor ***********

	public CourtController() {
		super();
	}

	
	// *********** Setters / Getters ***********

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	
	// *********** Actions ***********

	public String init() {
		return "court";
	}

	public String traitementCourt() {
		
		//TODO
		
		return "court";
	}
	
}

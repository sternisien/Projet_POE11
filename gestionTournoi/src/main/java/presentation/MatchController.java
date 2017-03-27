package presentation;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import job.GestionMatch;

@Component
@ManagedBean(name="matchController")
@SessionScoped
public class MatchController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	GestionMatch gestionMatch;

	private Date date;
	private String data;
	
	
	//*********** Constructor ***********
	
	public MatchController(){
		super();
	}


	//*********** Setters / Getters ***********
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	//*********** Actions ***********
		
	public String init() {
		return "match";
	}
	
	public String traitement(){
		
		System.out.println(date.toString());
		System.out.println(data);
		return "planning";
	}
	
}

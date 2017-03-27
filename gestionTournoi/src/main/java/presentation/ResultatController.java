package presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.stereotype.Component;


import java.io.Serializable;

@Component
@ManagedBean(name="resultatController")
@RequestScoped
public class ResultatController implements Serializable {

	private static final long serialVersionUID = 1L;

	
	//*********** Constructor ***********
	
	public ResultatController() {
		super();
	}


	//*********** Setters / Getters ***********
	
	
	
	
	//*********** Actions ***********
		
	public String init() {
		return "results";
	}
	
}

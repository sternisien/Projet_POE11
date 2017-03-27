package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "epreuve")
public class Epreuve {


	public Integer idepreuve;
	

	public String nomepreuve;

	public Epreuve(String nomepreuve) {
		super();
		this.nomepreuve = nomepreuve;
	}

	public Integer getIdepreuve() {
		return idepreuve;
	}

	public String getNomepreuve() {
		return nomepreuve;
	}

	public void setNomepreuve(String nomepreuve) {
		this.nomepreuve = nomepreuve;
	}
	
}

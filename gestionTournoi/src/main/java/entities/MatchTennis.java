package entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match_tennis")
public class MatchTennis {

	public Integer idmatch;
	
	
	public Court court;
	
	
	public Arbitre arbitre;
	

	public Epreuve epreuve;
	
	
	public Date date;
	

	public String duree;
	

	public String etat;
}

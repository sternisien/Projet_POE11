package job;

public interface GestionOrganisateur {

	void ajoutOrganisateur(String nom, String pseudo, String password);
	Boolean connection(String pseudo, String password);
}

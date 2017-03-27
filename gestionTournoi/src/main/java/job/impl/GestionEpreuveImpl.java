package job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EpreuveDao;
import job.GestionEpreuve;


@Service("gestionEpreuve")
public class GestionEpreuveImpl implements GestionEpreuve{

	@Autowired
	EpreuveDao epreuveDao;

	public GestionEpreuveImpl() {
		super();
	}
	
}

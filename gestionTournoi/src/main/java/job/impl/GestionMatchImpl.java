package job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MatchDao;
import job.GestionMatch;

@Service("gestionMatch")
public class GestionMatchImpl implements GestionMatch{

	@Autowired
	MatchDao matchDao;

	public GestionMatchImpl() {
		super();
	}
	
}

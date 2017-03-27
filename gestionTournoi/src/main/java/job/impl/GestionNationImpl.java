package job.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NationDao;
import entities.Nation;
import job.GestionNation;
import job.JobException;

@Service("gestionNation")
public class GestionNationImpl implements GestionNation {

	@Autowired
	NationDao nationDao;

	public GestionNationImpl() {
		super();
	}

	public List<Nation> getAllNations() throws JobException {
		
		List<Nation> lstNations = new ArrayList<Nation>();

		try {
			lstNations = nationDao.selectAll();
		} catch (RuntimeException transactionEx) {
			throw new JobException("La liste des nations n'a pas pu être récupérée");
		}

		return lstNations;
	}

}

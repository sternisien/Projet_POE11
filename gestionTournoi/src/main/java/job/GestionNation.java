package job;

import java.util.List;

import entities.Nation;

public interface GestionNation {

	public List<Nation> getAllNations() throws JobException;
}

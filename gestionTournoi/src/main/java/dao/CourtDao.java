package dao;

import java.util.List;

import entities.Court;

public interface CourtDao {

	void insert(Court court);
	void update(Court court);
	void delete(Court court);
	List<Court> selectAll();
}

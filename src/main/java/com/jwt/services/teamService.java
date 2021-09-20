package com.jwt.services;

import java.util.List;
import java.util.Optional;

import com.jwt.model.Team;

public interface teamService {

	public void add(Team team);
	public void update(Team team,Long teamid);
	Optional<Team> getById(Long teamid);
	
	public void delete(Long teamid);
	
	List<Team> list();
}

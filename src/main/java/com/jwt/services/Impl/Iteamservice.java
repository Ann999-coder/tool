package com.jwt.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.Team;
import com.jwt.repo.teamRepository;
import com.jwt.services.teamService;

@Service
public class Iteamservice implements teamService {

	@Autowired
	private teamRepository teamrepository;
	
	@Override
	public void add(Team team) {
		// TODO Auto-generated method stub
		teamrepository.save(team);
	}

	@Override
	public void update(Team team, Long teamid) {
		// TODO Auto-generated method stub
		Optional<Team> teamData= teamrepository.findById(teamid);
		
		if (teamData.isPresent()) {
			Team _team = teamData.get();
		      _team.setFirstName(team.getFirstName());
		      _team.setLastName(team.getLastName());
		      _team.setEmail(team.getEmail());
		      _team.setContact(team.getContact());
		      _team.setPassword(team.getPassword());
		      _team.setStatus(team.getStatus());
		      
		      teamrepository.save(_team);
		}
		
	}

	@Override
	public Optional<Team> getById(Long teamid) {
		// TODO Auto-generated method stub
		return teamrepository.findById(teamid);
	}

	@Override
	public void delete(Long teamid) {
		// TODO Auto-generated method stub
		teamrepository.deleteById(teamid);
	}

	@Override
	public List<Team> list() {
		// TODO Auto-generated method stub
		return teamrepository.findAll();
	}

}


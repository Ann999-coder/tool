package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.Team;

public interface teamRepository extends  JpaRepository<Team, Long> {

}

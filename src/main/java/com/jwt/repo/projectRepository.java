package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.Project;

public interface projectRepository extends  JpaRepository<Project, Long> {

}

package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.Client;

public interface clientRepository extends  JpaRepository<Client, Long> {

}

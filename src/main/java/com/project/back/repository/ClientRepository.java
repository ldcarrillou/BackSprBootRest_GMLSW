package com.project.back.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.back.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {

}

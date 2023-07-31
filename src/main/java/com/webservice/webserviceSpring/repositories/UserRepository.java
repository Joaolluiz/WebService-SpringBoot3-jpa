package com.webservice.webserviceSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webserviceSpring.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}

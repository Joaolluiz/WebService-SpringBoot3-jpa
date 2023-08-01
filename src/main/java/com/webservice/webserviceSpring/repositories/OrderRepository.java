package com.webservice.webserviceSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webserviceSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}

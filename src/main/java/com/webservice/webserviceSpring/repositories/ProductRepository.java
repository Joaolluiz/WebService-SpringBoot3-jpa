package com.webservice.webserviceSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webserviceSpring.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}

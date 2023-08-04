package com.webservice.webserviceSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.webserviceSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}

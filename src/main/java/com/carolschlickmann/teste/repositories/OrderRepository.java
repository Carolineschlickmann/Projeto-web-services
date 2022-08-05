package com.carolschlickmann.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolschlickmann.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

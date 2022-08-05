package com.carolschlickmann.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolschlickmann.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

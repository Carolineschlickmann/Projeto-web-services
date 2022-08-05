package com.carolschlickmann.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolschlickmann.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

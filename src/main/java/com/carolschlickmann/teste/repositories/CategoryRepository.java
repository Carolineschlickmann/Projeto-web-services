package com.carolschlickmann.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolschlickmann.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

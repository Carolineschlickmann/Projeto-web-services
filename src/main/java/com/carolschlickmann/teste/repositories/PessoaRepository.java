package com.carolschlickmann.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolschlickmann.teste.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}

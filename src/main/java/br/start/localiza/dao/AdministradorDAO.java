package br.start.localiza.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.start.localiza.model.Administrador;

public interface AdministradorDAO extends JpaRepository<Administrador, Integer> {

}

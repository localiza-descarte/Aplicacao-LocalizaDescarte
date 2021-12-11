package br.start.localiza.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.start.localiza.model.Logo;

public interface LogoDAO extends JpaRepository<Logo, Integer> {
	
	@Query(value =  "select * from logo where id_loja = ?1", nativeQuery = true)
	Logo buscarPorLoja(Integer IdLoja);
	
}

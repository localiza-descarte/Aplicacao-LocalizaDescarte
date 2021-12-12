package br.start.localiza.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.start.localiza.model.Loja;
import br.start.localiza.model.Usuario;

public interface LojaDAO extends JpaRepository<Loja, String> {
	
	@Query(value =  "select * from loja where cnpj = ?1 AND senha_loja = ?2", nativeQuery = true)
	Loja loginLoja(String cnpj, String senha);
	
	@Query(value = "select * from loja where nome_loja = ?1 ORDER BY RAND(cnpj) ", nativeQuery = true)
	List<Loja> buscarPorNome(String nome, String cnpj);
	
	@Query(value = "select count(cnpj) from loja", nativeQuery = true)
	public Loja lojasCadastradas(String cnpj);
}
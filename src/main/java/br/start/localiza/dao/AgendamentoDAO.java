package br.start.localiza.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.start.localiza.model.Agendamento;
import br.start.localiza.model.Loja;

public interface AgendamentoDAO extends JpaRepository<Agendamento, Integer> {

	@Query(value =  "select * from agendamento where loja_cnpj = ?1 AND usuario_cpf = ?2", nativeQuery = true)
	Loja loginLoja(String cnpj, String senha);
	
	@Query(value = "select * from agendamento where nome_loja = ?1 ORDER BY RAND(cnpj) ", nativeQuery = true)
	List<Loja> buscarPorNome(String nome, String cnpj);
	
	@Query(value = "select count(cnpj) from loja", nativeQuery = true)
	public Loja LojasCadastrados (String cnpj);
}
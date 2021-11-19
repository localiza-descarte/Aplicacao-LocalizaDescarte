package br.start.localiza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.start.localiza.dao.LojaDAO;
import br.start.localiza.model.Loja;

@Service
public class LojaService {
	
	@Autowired
	private LojaDAO lojaDAO;
	
	// Lista todas as lojas
	public List<Loja> mostraLojas() {
		return this.lojaDAO.findAll();
	}
	
	// Salvar o Lojista
	public Loja salvarLoja(Loja loja) {
		lojaDAO.save(loja);
		return lojaCnpj(loja.getCnpj());
	}
	
	// Editar o Lojista por id
	public Loja lojaCnpj(String cnpj) {
		return lojaDAO.findById(cnpj).get();
	}
	
	// Deletar Loja
	public void excluirLoja(String cnpj) {
		lojaDAO.deleteById(cnpj);
	}
	
	// Realizar o login da lojista
	public Loja loginDaLoja(String cnpj, String senha) {
		return lojaDAO.loginLoja(cnpj, senha);
	}
}

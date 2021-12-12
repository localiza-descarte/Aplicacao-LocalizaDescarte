package br.start.localiza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.start.localiza.dao.LogoDAO;
import br.start.localiza.model.Logo;

@Service
public class LogoService {
	
	@Autowired
	private LogoDAO logoDAO;
	
	// Mostra logo da loja
	public Logo getLogo(Integer idLoja) {
		return logoDAO.buscarPorLoja(idLoja);
	}
	
	//salvar logo
	public void save(Logo logo) {
		logoDAO.save(logo);
	}
	
}

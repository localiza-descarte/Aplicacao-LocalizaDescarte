package br.start.localiza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@GetMapping ("/painel-administrador")
	public String getPainel() {
		return "painel-administrador";
	}
	
	@GetMapping ("/mais-loja")
	public String getMaisLoja() {
		return "mais-loja";
	}
	
	@GetMapping ("/mais-usuario")
	public String getMaisUsuario() {
		return "mais-usuario";
	}
	
	@GetMapping ("/configuracao-loja")
	public String getConfiguraLoja() {
		return "configuracao-loja";
	}
	
	@GetMapping ("/login-administrador")
	public String getLoginAdministrador() {
		return "login-administrador";
	}
	
	@GetMapping ("/sobre")
	public String getSobre() {
		return "sobre";
	}
	
	@GetMapping ("/lgpd")
	public String getLgbd() {
		return "lgpd";
	}
	
	@GetMapping ("/login-lojista")
	public String getLoginLojista() {
		return "login-lojista";
	}
	
	@GetMapping ("/dados-administrador")
	public String getDadosAdministrador() {
		return "dados-administrador";
	}
	
	
	@GetMapping ("/config-loja")
	public String getConfigAdmLoja() {
		return "config-adm-loja";
	}
	
	@GetMapping ("/agendamentos-usuario")
	public String getAgendamentosUsuario() {
		return "agendamentos-usuario";
	}
	
	
	@GetMapping ("/lojista")
	public String getLojista() {
		return "lojista";
	}
	
	@GetMapping ("/configuracao-usuario")
	public String getConfiguraUsuario() {
		return "configuracao-usuario";
	}
	
	@GetMapping ("/configuracao-edicao-usuario")
	public String getConfiguraEdicaoUsuario() {
		return "configuracao-edicao-usuario";
	}
}
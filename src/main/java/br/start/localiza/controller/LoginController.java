package br.start.localiza.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.start.localiza.model.Loja;
import br.start.localiza.model.Usuario;
import br.start.localiza.service.LojaService;
import br.start.localiza.service.UsuarioService;
import br.start.localiza.dao.Util;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private LojaService lojaService;
	
	@PostMapping("/efetuarLogin")
	public String efetuarLogin(Usuario usuario,
			RedirectAttributes ra,
			HttpSession session) {
		
		usuario = usuarioService.loginUsuario(
				usuario.getCpf(), Util.md5(usuario.getSenha()));
		
		if (usuario != null) {
			// Guardar sessao o objeto usuario
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:/usuario";
		} else {
			// Enviar uma mensagem 
			ra.addFlashAttribute("mensagem", "Login/senha inválidos");
			return "redirect:/login";
		}
	}
	
	@PostMapping("/efetuarLoginLoja")
	public String efetuarLoginLoja(Loja loja, RedirectAttributes ra, HttpSession session) {
		
		loja = lojaService.loginDaLoja (loja.getCnpj(), Util.md5(loja.getSenha()));
		
		if (loja != null) {
			// Guardar sessao o objeto loja
			session.setAttribute("usuarioLogado", loja);
			return "redirect:/lojista";
		} else {
			// Enviar uma mensagem 
			ra.addFlashAttribute("mensagem", "Login/senha inválidos");
			return "redirect:/login-lojista";
		}
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

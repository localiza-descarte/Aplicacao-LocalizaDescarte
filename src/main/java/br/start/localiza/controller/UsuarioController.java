package br.start.localiza.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.start.localiza.model.Loja;
import br.start.localiza.model.Usuario;
import br.start.localiza.service.LojaService;
import br.start.localiza.service.UsuarioService;
import br.start.localiza.dao.Util;


@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private LojaService lojaService;
	
	@GetMapping("/cadastro")
	public String cadastroUsu(Usuario usuario) {
		
		return "/login";
	}
	
	@GetMapping("/esqueceu-senha")
	public String getEsqueceu() {
		return "esqueceu-senha";
	}
	
	@PostMapping("/EnviarDadosSenha")
	public String EnviarDadosSenha(String email, String cpf, Model model) {
		Usuario usuario = this.usuarioService.RecuperacaoSenha(email, cpf);
		
		if (usuario != null) {
			model.addAttribute("usuarioObject", usuario);
			return "redirect:/pergunta-chave";
		}else {
			System.out.print("Usuário não encontrado");
			return "redirect:/esqueceu-senha";
		}
	}
	
	@PostMapping("/EnviarResposta")
	public String EnviarPerguntaChave(String resposta, HttpSession session) {
		Usuario usuario = this.usuarioService.ConfirmacaoResposta(resposta);
		if (usuario != null) {
			session.setAttribute("usuarioLogado", usuario);
			return "redirect:/usuario";
		}else {
			System.out.print("Resposta inválida");
			return "redirect:/pergunta-chave";
		}
	}
	
	@GetMapping("/pergunta-chave")
	public String getPergunta() {
		return "pergunta-chave";
	}
	
	
	
	@PostMapping("/salvarUsuario")
    public String novoUsuario(@ModelAttribute("usuario") Usuario usuario) {
		
		usuario.setSenha(Util.md5(usuario.getSenha()));
        usuarioService.salvarUsuario(usuario);
        return "/login";
	}
	
	@GetMapping ("/usuarios")
    public String mostraUsuario(Model model) {
        List<Usuario> usuario = usuarioService.mostraUsuario();
        model.addAttribute("usuarios", usuario);
        return "mais-usuario";
    }
	
	
	@GetMapping ("/editarUsuario")
	public String editarUsuario( String cpf,Model model) {
		model.addAttribute("usuario", usuarioService.usuarioCpf(cpf));
		return "configuracao-usuario";
	}

	@GetMapping ("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index";
		}
	
	@GetMapping ("/usuario")
	public String getUsuario(Model model) {
		model.addAttribute("lojas", this.lojaService.mostraLojas());
		return "usuario";
	}
	
	  @PostMapping ("/atualizar")
	   public String atualizarUsuario(@Valid Usuario usuario, BindingResult result) {
	        
	        if(result.hasErrors()) {
	        	System.out.println(result.getAllErrors().get(0).getDefaultMessage());
	        	usuario.setSenha(Util.md5(usuario.getSenha()));
	        	System.out.println(usuario.getCpf());
	        	return "usuario";
	        }else {
	        	System.out.println(usuario.getCpf());
	        	usuario.setSenha(Util.md5(usuario.getSenha()));
	        	usuarioService.salvarUsuario(usuario);
		        return "usuario";
	        }
	    }
	 
	  @GetMapping("/delete/{cpf}")
	    private String deletarUsuario(@PathVariable("cpf") String cpf) {
	        usuarioService.excluirUsuario(cpf);
	        return "usuario";
	    }
}
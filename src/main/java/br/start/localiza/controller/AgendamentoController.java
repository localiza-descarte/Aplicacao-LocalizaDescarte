package br.start.localiza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.start.localiza.dao.Util;
import br.start.localiza.model.Agendamento;
import br.start.localiza.model.Usuario;
import br.start.localiza.service.AgendamentoService;
import br.start.localiza.service.LojaService;
import br.start.localiza.service.UsuarioService;

@Controller
public class AgendamentoController {
	
	@Autowired
	private AgendamentoService agendamentoService;
	
	@Autowired
	private LojaService lojaService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping ("/agendamento")
	public String getAgendament(Model model, String cnpj) {
		model.addAttribute("loja", this.lojaService.lojaCnpj(cnpj));
		return "agendamento";
	}
	
	@PostMapping("/salvarAgendamento")
    public String novoAgendamento(Agendamento agendamento) {
		agendamentoService.salvarAgendamento(agendamento);
        return "/usuario";
	}
}

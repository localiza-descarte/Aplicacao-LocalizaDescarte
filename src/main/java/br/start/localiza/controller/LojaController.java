package br.start.localiza.controller;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import br.start.localiza.dao.Util;
import br.start.localiza.model.Logo;
import br.start.localiza.model.Loja;
import br.start.localiza.model.Produto;
import br.start.localiza.service.LogoService;
import br.start.localiza.service.LojaService;

@Controller
public class LojaController {
	
	@Autowired
	private LojaService lojaService;
	
	@Autowired
	private LogoService logoService;
	
	@GetMapping("/cadastroLoja")
	public String cadastroLoja(Loja loja) {
		
		return "adm-cadastro-loja";
	}
	
	@PostMapping("/salvarLoja")
    public String novoLoja(@ModelAttribute("loja") Loja loja, @RequestParam("fileLogo") MultipartFile file) {
		
		Logo logo = new Logo();
		logo.setLoja(loja);
		try {
			logo.setImagem(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logoService.save(logo);
		
		loja.setSenha(Util.md5(loja.getSenha()));
        lojaService.salvarLoja(loja);
		return "index";
	}
	
	@ModelAttribute("produtos")
	public Produto[] getListaProd() {
		return Produto.values();
		
	}
	
	@GetMapping("/logo/{loja.cnpj}")
	@ResponseBody
	public byte[] exibirImagem(@PathVariable("idLoja") Integer idLoja) {
		Logo logo = logoService.getLogo(idLoja);
		return logo.getImagem();
	}
	
}

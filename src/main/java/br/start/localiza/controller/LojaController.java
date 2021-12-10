package br.start.localiza.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import br.start.localiza.dao.Util;
import br.start.localiza.model.Loja;
import br.start.localiza.model.Produto;
import br.start.localiza.service.LojaService;

@Controller
public class LojaController {
	
	@Autowired
	private LojaService lojaService;
	
	@GetMapping("/cadastroLoja")
	public String cadastroLoja(Loja loja) {
		
		return "adm-cadastro-loja";
	}
	
	@PostMapping("/salvarLoja")
    public String novoLoja(@ModelAttribute("loja") Loja loja, @RequestParam("fileLogo") MultipartFile file) {
		try {
			loja.setLogo(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		loja.setSenha(Util.md5(loja.getSenha()));
        lojaService.salvarLoja(loja);
		return "index";
	}
	
	@ModelAttribute("produtos")
	public Produto[] getListaProd() {
		return Produto.values();
		
	}
	
	@GetMapping("/logo/{idLoja}")
	@ResponseBody
	public byte[] exibirImagen(@PathVariable("idLoja") String idLoja) {
		Loja loja = lojaService.lojaCnpj(idLoja);
		return loja.getLogo();
	}
	
}

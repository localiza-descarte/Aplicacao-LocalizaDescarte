package br.start.localiza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.start.localiza.dao.UsuarioDAO;
import br.start.localiza.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	// Lista todos os usuarios
	public List<Usuario> mostraUsuario() {
		return (List<Usuario>) usuarioDAO.findAll();
	}

	// Editar o Usuario por id
	public Usuario usuarioCpf(String cpf) {
		return usuarioDAO.findById(cpf).get();
	}

	// Salvar o Usuario
	public Usuario salvarUsuario(Usuario usuario) {
		usuarioDAO.save(usuario);
		return usuarioCpf(usuario.getCpf());
	}

	// Deletar Usuario
	public void excluirUsuario(String cpf) {
		usuarioDAO.deleteById(cpf);
	}

	// Realizar o login do Usuario
	public Usuario loginUsuario(String cpf, String senha) {
		return usuarioDAO.findByLoginAndSenha(cpf, senha);
	}
	
	// Recuperar a Senha
	public Usuario RecuperacaoSenha(String email, String cpf) {
		return usuarioDAO.EsqueceuSenha(email, cpf);
	}
		
	// Resposta para a Senha
	public Usuario ConfirmacaoResposta(String resposta) {
		return usuarioDAO.RespostaChave(resposta);
	}
}
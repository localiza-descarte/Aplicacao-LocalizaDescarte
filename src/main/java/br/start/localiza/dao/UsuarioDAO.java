package br.start.localiza.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.start.localiza.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, String > {
	
	@Query(value =  "select * from usuario where cpf = ?1 AND senha_usuario = ?2", nativeQuery = true)
	public Usuario findByLoginAndSenha(String cpf, String senha);
	
	@Query(value = "select count(cpf) from usuario", nativeQuery = true)
	public Usuario UsuarioCadastrados (String cpf);
	
	@Query(value =  "select * from usuario where email_usuario = ?1 AND  cpf = ?2", nativeQuery = true)
	public Usuario EsqueceuSenha(String email, String cpf);
	
	@Query(value =  "select * from usuario where resposta_usuario = ?1 ", nativeQuery = true)
	 public Usuario RespostaChave(String resposta);
	
}
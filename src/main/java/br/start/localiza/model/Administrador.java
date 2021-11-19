package br.start.localiza.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "administrador")
public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_adm;
	
	@Column ( name =  "email_admin")
	private String email;
	
	@Column (name =  "senha_admin")
	private String senha;
	
	@OneToMany
	private List<Loja> loja;
	
	@OneToMany
	private List<Usuario> usuario;



	public List<Loja> getLoja() {
		return loja;
	}

	public void setLoja(List<Loja> loja) {
		this.loja = loja;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public Integer getId_adm() {
		return id_adm;
	}

	public void setId_adm(Integer id_adm) {
		this.id_adm = id_adm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

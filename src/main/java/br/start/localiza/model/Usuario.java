package br.start.localiza.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "usuario")
public class Usuario {
	
	@Id
	@NotBlank (message = "o campo CPF não pode está vazio")
	private String  cpf;
	
	@Column (nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	

	@Column (nullable = false,length = 150,name = "nome_usuario")
	@NotBlank (message = "o campo Nome não pode está vazio")
	private String nome;
	
	@Column (nullable = false, length = 90, name =  "email_usuario")
	@NotBlank (message = "o campo E-mail não pode está vazio")
	private String email;
	
	@Column (nullable = false,length = 15,name = "telefone_usuario")
	@NotBlank (message = "o campo Telefone não pode está vazio")
	private String telefone;
	
	@Column (nullable = false,name = "senha_usuario")
	@NotBlank (message = "o campo Senha não pode está vazio")
	private  String senha;
	
	@Column (nullable = false,name = "resposta_usuario")
	@NotBlank (message = "o campo Resposta Chave não pode está vazio")
	private  String resposta;
	

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

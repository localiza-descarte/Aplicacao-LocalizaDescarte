package br.start.localiza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table (name = "loja")
public class Loja {
	
	@Id
	@NotBlank (message = "o  campo n�o pode est�  vazio")
	private String cnpj;
	
	@Column (nullable = false, length = 90, name =  "email_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String email;
	
	@Column (nullable = false, length = 15, name =  "telefone_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String telefone;
	
	@Column (nullable = false, length = 150, name =  "nome_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String nome;
	
	@Column (nullable = false, name =  "senha_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String senha;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "produto_loja")
	private Produto produto;
	
	@Column (nullable = false, name =  "estado_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String estado;
	
	@Column (nullable = false, name =  "cidade_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String cidade;
	
	@Column (nullable = false, name =  "bairro_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String bairro;
	
	@Column (nullable = false, name =  "rua_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String rua;
	
	@Column (nullable = false, name =  "numero_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String numero;
	
	@Column (nullable = false, name =  "cep_loja")
	@NotBlank (message = "o  campo n�o pode esta  vazio")
	private String cep;
	
	

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}


	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

	
	
	
	

}

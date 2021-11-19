package br.start.localiza.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Parent;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Agendamento {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id_agendamento;
//	
//	@ManyToOne
//	private Usuario usuario;
//	
//	@ManyToOne
//	private Loja loja;
//	
//	@Enumerated(EnumType.STRING)
//	private Produto produto;
	
	private String marca;
	
	@Column (nullable = false, name = "nome_usuario")
	private String nome;
	
	@Column (nullable = false, name = "cpf_usuario")
	private String cpf;
	
	@Column (nullable = false, name = "produto")
	private String produto;
	
	@DateTimeFormat (pattern = "HH:mm:ss")
	private String horaDoAgendamento;
	
	@DateTimeFormat (pattern = "DD:mm:aaaa")
 	private LocalDate diaDoAgendamento;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}



	public Agendamento() {
		
	}

	public Integer getId_agendamento() {
		return id_agendamento;
	}


	public void setId_agendamento(Integer id_agendamento) {
		this.id_agendamento = id_agendamento;
	}


//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}
//
//
//	public Loja getLoja() {
//		return loja;
//	}
//
//
//	public void setLoja(Loja loja) {
//		this.loja = loja;
//	}


//	public Produto getProduto() {
//		return produto;
//	}

//
//	public void setProduto(Produto produto) {
//		this.produto = produto;
//	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getHoraDoAgendamento() {
		return horaDoAgendamento;
	}


	public void setHoraDoAgendamento(String horaDoAgendamento) {
		this.horaDoAgendamento = horaDoAgendamento;
	}


	public LocalDate getDiaDoAgendamento() {
		return diaDoAgendamento;
	}


	public void setDiaDoAgendamento(LocalDate diaDoAgendamento) {
		this.diaDoAgendamento = diaDoAgendamento;
	}		
}



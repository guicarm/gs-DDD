package br.com.fiap.beans;

public class Mercado extends Cadastro {
	
	private String cnpjMercado;
	private String razaoSocialMercado;
	private double rendaMensalMercado;

// ================= CONSTRUTORES =================
	
	// Construtor vazio
	public Mercado() {
		super();
	}

	// Construtor cheio
	public Mercado(String cnpjMercado, String razaoSocialMercado, double rendaMensalMercado) {
		super();
	this.cnpjMercado = cnpjMercado;
	this.razaoSocialMercado = razaoSocialMercado;
	this.rendaMensalMercado = rendaMensalMercado;
	}

	// Construtor com herança
	public Mercado(String nome, String email, String telefone, String cnpjMercado, String razaoSocialMercado, double rendaMensalMercado) {
		super(nome, email, telefone);
		this.cnpjMercado = cnpjMercado;
		this.razaoSocialMercado = razaoSocialMercado;
		this.rendaMensalMercado = rendaMensalMercado;
	}

	
// ================= SETTERS & GETTERS =================
	public String getCnpjMercado() {
		return cnpjMercado;
	}

	public void setCnpjMercado(String cnpjMercado) {
		this.cnpjMercado = cnpjMercado;
	}

	public String getRazaoSocialMercado() {
		return razaoSocialMercado;
	}

	public void setRazaoSocialMercado(String razaoSocialMercado) {
		this.razaoSocialMercado = razaoSocialMercado;
	}

	public double getRendaMensalMercado() {
		return rendaMensalMercado;
	}

	public void setRendaMensalMercado(double rendaMensalMercado) {
		this.rendaMensalMercado = rendaMensalMercado;
	}	
	
// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================
	
	public String identificacao() {
				return "MERCADO PARCEIRO";
	}
}

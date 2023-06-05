package br.com.fiap.beans;

public class Ong extends Cadastro{

	private String cnpjOng;
	private String razaoSocialOng;

// ================= CONSTRUTORES =================
	
	// Construtor vazio
	public Ong() {
		super();
	}

	// Construtor cheio
	public Ong(String cnpjOng, String razaoSocialOng) {
	super();
	this.cnpjOng = cnpjOng;
	this.razaoSocialOng = razaoSocialOng;
	}

	// Construtor com herança
	public Ong(String nome, String email, String telefone, String cnpjOng, String razaoSocialOng) {
		super(nome, email, telefone);
		this.cnpjOng = cnpjOng;
		this.razaoSocialOng = razaoSocialOng;
	}

	
// ================= SETTERS & GETTERS =================
	public String getCnpjOng() {
		return cnpjOng;
	}

	public void setCnpjOng(String cnpjOng) {
		this.cnpjOng = cnpjOng;
	}

	public String getRazaoSocialOng() {
		return razaoSocialOng;
	}

	public void setRazaoSocialOng(String razaoSocialOng) {
		this.razaoSocialOng = razaoSocialOng;
	}	

// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================
	
	public String identificacao() {
				return "ONG PARCEIRA";
	}
}

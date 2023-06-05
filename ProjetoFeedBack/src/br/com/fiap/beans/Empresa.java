package br.com.fiap.beans;

public class Empresa extends Cadastro {
	
	private String cnpjEmpresa;
	private String razaoSocialEmpresa;
	private double rendaMensalEmpresa;

// ================= CONSTRUTORES =================
	
	// Construtor vazio
	public Empresa() {
		super();
	}

	// Construtor cheio
	public Empresa(String cnpjEmpresa, String razaoSocialEmpresa, double rendaMensalEmpresa) {
		super();
	this.cnpjEmpresa = cnpjEmpresa;
	this.razaoSocialEmpresa = razaoSocialEmpresa;
	this.rendaMensalEmpresa = rendaMensalEmpresa;
	}

	// Construtor com herança
	public Empresa(String nome, String email, String telefone, String cnpjEmpresa, String razaoSocialEmpresa, double rendaMensalEmpresa) {
		super(nome, email, telefone);
		this.cnpjEmpresa = cnpjEmpresa;
		this.razaoSocialEmpresa = razaoSocialEmpresa;
		this.rendaMensalEmpresa = rendaMensalEmpresa;
	}

	
// ================= SETTERS & GETTERS =================
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getRazaoSocialEmpresa() {
		return razaoSocialEmpresa;
	}

	public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
		this.razaoSocialEmpresa = razaoSocialEmpresa;
	}

	public double getRendaMensalEmpresa() {
		return rendaMensalEmpresa;
	}

	public void setRendaMensalEmpresa(double rendaMensalEmpresa) {
		this.rendaMensalEmpresa = rendaMensalEmpresa;
	}	
	
// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================
	
	public String identificacao() {
				return "EMPRESA PARCEIRA";
	}
}

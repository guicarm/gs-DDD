package br.com.fiap.beans;

public class PessoaFisica extends Cadastro {
	
	private String cpf;
	private String rg;
	private double rendaMensalFamiliar;
	
//=================== CONSTRUTORES =========================
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String cpf, String rg, double rendaMensalFamiliar) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}

	// CONSTRUTOR COM HERANÇA
	public PessoaFisica(String nome, String email, String telefone, String cpf, String rg, double rendaMensalFamiliar) {
		super(nome, email, telefone);
		this.cpf = cpf;
		this.rg = rg;
		this.rendaMensalFamiliar = rendaMensalFamiliar;
	}

//=================== SETTERS & GETTERS =========================
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getRendaMensalFamiliar() {
		return rendaMensalFamiliar;
	}

	public void setRendaMensalFamiliar(double rendaMensalFamiliar) {
		this.rendaMensalFamiliar = rendaMensalFamiliar;
	}
	
// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================
	
			public String identificacao() {
				return "PESSOA FÍSICA / FAMÍLIA";
			}
}

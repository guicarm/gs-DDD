package br.com.fiap.beans;

public class Cadastro {
	
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;

	//=================== CONSTRUTORES =========================
		public Cadastro() {
			super();
		}
		
		public Cadastro(String nome, String email, String telefone, Endereco endereco) {
			super();
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.endereco = endereco;
		}
		

		public Cadastro(String nome, String email, String telefone) {
			super();
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
		}

	//=================== SETTERS & GETTERS =========================
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

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
// ================ MÉTODO PARA A IDENTIFICAÇÃO DO CADASTRO ===================
		
		public String identificacao() {
			return " ";
		}
}

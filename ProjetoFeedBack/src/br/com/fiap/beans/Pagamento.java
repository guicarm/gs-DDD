package br.com.fiap.beans;

public class Pagamento {
	
	private double valorPagamento;
	private String dataPagamento;
	
// ================= CONSTRUTORES ======================
	public Pagamento() {
		super();
	}

	public Pagamento(double valorPagamento, String dataPagamento) {
		super();
		this.valorPagamento = valorPagamento;
		this.dataPagamento = dataPagamento;
	}

// ================ SETTERS & GETTERS ====================
	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
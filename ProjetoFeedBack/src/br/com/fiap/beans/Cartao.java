package br.com.fiap.beans;

public class Cartao extends Pagamento {

	private String numeroCartao;
	private String bandeiraCartao;
	private String dataVencimentoCartao;
	private String tipoCartao;
	
// =================== CONSTRUTORES =====================
	public Cartao() {
		super();
	}
	
	public Cartao(String numeroCartao, String bandeiraCartao, String dataVencimentoCartao, String tipoCartao) {
		super();
		this.numeroCartao = numeroCartao;
		this.bandeiraCartao = bandeiraCartao;
		this.dataVencimentoCartao = dataVencimentoCartao;
		this.tipoCartao = tipoCartao;
	}
	
	public Cartao(double valorPagamento, String dataPagamento, String numeroCartao, String bandeiraCartao,
			String dataVencimentoCartao, String tipoCartao) {
		super(valorPagamento, dataPagamento);
		this.numeroCartao = numeroCartao;
		this.bandeiraCartao = bandeiraCartao;
		this.dataVencimentoCartao = dataVencimentoCartao;
		this.tipoCartao = tipoCartao;
	}

// =================== SETTERS & GETTERS =====================
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getDataVencimentoCartao() {
		return dataVencimentoCartao;
	}

	public void setDataVencimentoCartao(String dataVencimentoCartao) {
		this.dataVencimentoCartao = dataVencimentoCartao;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
}

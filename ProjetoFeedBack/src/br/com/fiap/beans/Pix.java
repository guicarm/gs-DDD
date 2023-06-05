package br.com.fiap.beans;

public class Pix extends Pagamento {

	private String tipoChave;
	private String codigoChave;
	
// ============ CONSTRUTORES ============
	public Pix() {
		super();
	}


	public Pix(String tipoChave, String codigoChave) {
		super();
		this.tipoChave = tipoChave;
		this.codigoChave = codigoChave;
	}


	public Pix(double valorPagamento, String dataPagamento, String tipoChave, String codigoChave) {
		super(valorPagamento, dataPagamento);
		this.tipoChave = tipoChave;
		this.codigoChave = codigoChave;
	}
// ============= SETTERS & GETTERS ==============
	public String getTipoChave() {
		return tipoChave;
	}


	public void setTipoChave(String tipoChave) {
		this.tipoChave = tipoChave;
	}


	public String getCodigoChave() {
		return codigoChave;
	}


	public void setCodigoChave(String codigoChave) {
		this.codigoChave = codigoChave;
	}
}

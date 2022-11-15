package model;

public class Vaga {
	private int id;
	private Integer numero;
	private EVagaStatus vagaStatus;
	
	public Vaga(int id, Integer numero, EVagaStatus vagaStatus) {
		this.id = id;
		this.numero = numero;
		this.vagaStatus = vagaStatus;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public EVagaStatus getVagaStatus() {
		return vagaStatus;
	}
	public void setVagaStatus(EVagaStatus vagaStatus) {
		this.vagaStatus = vagaStatus;
	}
}

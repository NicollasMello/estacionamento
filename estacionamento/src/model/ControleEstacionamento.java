package model;

import java.time.LocalDateTime;

public class ControleEstacionamento {
	private int id;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private Veiculo veiculo;
	private Vaga vaga;
	
	public ControleEstacionamento(int id, LocalDateTime entrada, LocalDateTime saida, Veiculo veiculo, Vaga vaga) {
		this.id = id;
		this.entrada = entrada;
		this.saida = saida;
		this.veiculo = veiculo;
		this.vaga = vaga;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
}

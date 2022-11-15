package model;

import java.util.List;

public class Veiculo {
	private int id;
	private String placa;
	private Modelo modelo;
	private Cliente cliente;
	private List<ControleEstacionamento> controleEstacionamentoList;
	
	public Veiculo(int id, String placa, Modelo modelo, Cliente cliente,
			List<ControleEstacionamento> controleEstacionamentoList) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.cliente = cliente;
		this.controleEstacionamentoList = controleEstacionamentoList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ControleEstacionamento> getControleEstacionamentoList() {
		return controleEstacionamentoList;
	}

	public void setControleEstacionamentoList(List<ControleEstacionamento> controleEstacionamentoList) {
		this.controleEstacionamentoList = controleEstacionamentoList;
	}
}

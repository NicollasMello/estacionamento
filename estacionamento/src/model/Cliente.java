package model;

import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String celular;
	private List<Veiculo> veiculoList;
	
	public Cliente(int id, String nome, String cpf, String celular, List<Veiculo> veiculoList) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.veiculoList = veiculoList;
	}
	
	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Veiculo> getVeiculoList() {
		return veiculoList;
	}

	public void setVeiculoList(List<Veiculo> veiculoList) {
		this.veiculoList = veiculoList;
	}
	
}

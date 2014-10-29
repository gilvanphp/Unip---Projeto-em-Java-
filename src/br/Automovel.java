package br;

public class Automovel {
	
	private int renavam;

	private String modelo;

	private String placa;

	private int ano;

	private boolean status;
	
	/*Getters & Setters*/
	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

package br;

public class Pessoa {

	protected int id;

	protected String nome;

	protected int cpf;

	protected String email;

	protected String senha;

	protected int tipo;

	public boolean entrar(String email, String senha) {
		boolean logou = false;
		
		if(this.email.equals(email) && this.senha.equals(senha)) logou = true;		
		
		return logou;
	}

	public void sair() {

	}
	
	/*Getters & Setters*/
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}

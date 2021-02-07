package com.bankline.models;

public class Usuario {
	String cpf;
	String nome;
	String login;
	String senha;
	
	public Usuario(String cpf, String nome, String login, String senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}

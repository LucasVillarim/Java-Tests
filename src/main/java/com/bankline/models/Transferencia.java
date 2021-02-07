package com.bankline.models;

public class Transferencia {
	Conta contaDestino;
	String descricao;
	Integer id;
	String login;
	Boolean padrao;
	char tipoMovimento;
	
	public Transferencia(
			Conta contaDestino, 
			String descricao, 
			Integer id, 
			String login, 
			Boolean padrao, 
			char tipoMovimento) {};
	
	public Conta getContaDestino() {
		return contaDestino;
	};
	
	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	};
	
	public String getDescricao() {
		return descricao;
	};
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	};
	
	public Integer getId() {
		return id;
	};
	
	public void setId(Integer id) {
		this.id = id;
	};
	
	public String getLogin() {
		return login;
	};
	
	public void setLogin(String login) {
		this.login = login;
	};
	
	public Boolean getPadrao() {
		return padrao;
	};
	
	public void setPadrao(Boolean padrao) {
		this.padrao = padrao;
	};
	
	public char getTipoMovimento() {
		return tipoMovimento;
	};
	
	public void setTipoMovimento(char tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	};

	
}

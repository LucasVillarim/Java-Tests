package com.bankline.models;

public class PlanoConta {
	private String descricao;
	//Receita ou Despesa.
	private String finalidade;
	
	public PlanoConta(String descricao, String finalidade) {
		this.descricao = descricao;
		this.finalidade = finalidade;
	}
}

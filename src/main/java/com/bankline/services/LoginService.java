package com.bankline.services;

import com.bankline.models.Conta;
import com.bankline.repository.UsuariosRepository;

public class LoginService {
	Conta conta;
	UsuariosRepository cadastradosRepository = new UsuariosRepository();

	
	public String logar(String login, String senha) {
		String tentativaLogin = cadastradosRepository.getUser(login, senha);
		return tentativaLogin;
	}
}

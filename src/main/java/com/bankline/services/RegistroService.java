package com.bankline.services;

import com.bankline.models.Usuario;
import com.bankline.repository.UsuariosRepository;

public class RegistroService {
	UsuariosRepository cadastrados = new UsuariosRepository();
	
	
	//Joga no DB
	public String cadastrar(Usuario user) {
		if (cadastrados.cadastrados.contains(user)) {
			return "usuário já existe.";
		}
		
		cadastrados.addUser(user);
		return "usuário cadastrado";
		}
	
	
}

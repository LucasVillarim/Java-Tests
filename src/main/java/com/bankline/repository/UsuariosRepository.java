package com.bankline.repository;

import java.util.HashSet;
import java.util.Set;

import com.bankline.models.Usuario;

public class UsuariosRepository {
	Set<Usuario> cadastrados = new HashSet<Usuario>();

	public String cadastrar(Usuario user) {
		
		for (Usuario registeredUser : cadastrados) {
			if (registeredUser.getLogin() == user.getLogin()) {
				return registeredUser.getLogin();
			}
		}
		cadastrados.add(user);
		return "cadastrou";
	}
}

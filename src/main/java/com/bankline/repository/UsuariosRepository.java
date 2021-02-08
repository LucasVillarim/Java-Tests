package com.bankline.repository;

import java.util.HashSet;
import java.util.Set;

import com.bankline.models.Usuario;

public class UsuariosRepository {
	public Set<Usuario> cadastrados = new HashSet<Usuario>();

	public void addUser(Usuario user) {
		cadastrados.add(user);
	}

	public String getUser(String login, String senha) {
		for (Usuario user: cadastrados) {
			if (user.getLogin() == login && user.getSenha() == senha) {
				return login;
			}
		}

		return null;
	}
}

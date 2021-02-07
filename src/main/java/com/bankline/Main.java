package com.bankline;

import com.bankline.models.Usuario;
import com.bankline.repository.UsuariosRepository;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario("11094722421", "Lucas Villarim", "lvillarim","123456");
		Usuario user2 = new Usuario("11094722421", "Lucas Villarim", "lvillarim2","123456");
		Usuario user3 = new Usuario("11094722421", "Lucas Villarim", "lvillarim3","123456");
		UsuariosRepository repo = new UsuariosRepository();
		
		System.out.println(repo.cadastrar(user));
		System.out.println(repo.cadastrar(user2));
		System.out.println(repo.cadastrar(user3));
		System.out.println(repo.cadastrar(user));
		System.out.println(repo.cadastrar(user2));
		System.out.println(repo.cadastrar(user3));
	}

}

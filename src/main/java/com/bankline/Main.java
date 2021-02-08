package com.bankline;

import com.bankline.models.Usuario;
import com.bankline.repository.UsuariosRepository;
import com.bankline.services.LoginService;
import com.bankline.services.RegistroService;

public class Main {

	public static void main(String[] args) throws Exception {
		Usuario user = new Usuario("11094722421", "Lucas Villarim", "lvillarim", "123456");
		Usuario user2 = new Usuario("11094722421", "Lucas Villarim", "lvillarim2","123456");
		
		RegistroService newUser = new RegistroService();
		LoginService loginUser = new LoginService();
		
//		Para ver se os dados estão sendo guardados corretamente no HashSet.
		System.out.println(newUser.cadastrar(user));
		System.out.println(newUser.cadastrar(user2));
		System.out.println(newUser.cadastrar(user));

		// Login
		System.out.println(loginUser.logar(user.getLogin(), user.getSenha()));
//		System.out.println(loginUser.logar(user2));

	}

}

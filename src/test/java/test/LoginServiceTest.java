package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bankline.models.Usuario;
import com.bankline.repository.UsuariosRepository;
import com.bankline.services.LoginService;

public class LoginServiceTest {
	Usuario user;
	LoginService loginService;
	UsuariosRepository repo;
	Integer loginLength;
	
	@BeforeEach
	void setupTheTest() throws Exception {
		user = new Usuario("11094722421", "Lucas Villarim", "lvillarim", "123456");
		repo = new UsuariosRepository();
		loginService = new LoginService();
		repo.addUser(user);
		loginLength = user.getLogin().length();
		// user = null;
	}
	
	@Test
	@DisplayName("Login must be different from null")
	void loginIsNotEmpty() {
		assertNotNull(user);
	}
	
	@Test
	@DisplayName("checks if user already exists")
	void testIfUserExists() {
		String usuarioTestado = null;
		for (Usuario storedUser: repo.cadastrados) {
			if (storedUser.getLogin() == user.getLogin()) {
				usuarioTestado = storedUser.getLogin();
			}
		}
		assertNotNull(usuarioTestado);
//		assertNull(usuarioTestado);
	}
	
	@Test
	@DisplayName("login length must be less than 20")
	void testLoginLength() {
		Boolean passTest = false;
		Integer checkLogin = loginLength.compareTo(20);
		
		if (checkLogin == -1 || checkLogin == 0) {
			passTest = true;
		}
		
		assertTrue(passTest);
	}
	
	@Test
	@DisplayName("tests for valid password")
	void testIfPasswordIsValid() {
		Boolean testPass = false;
		
		if (loginService.logar(user.getLogin(), user.getSenha()) == user.getLogin()) {
			testPass = true;
		};
		
//		assertTrue(testPass);
		assertFalse(testPass);
	}
	
}

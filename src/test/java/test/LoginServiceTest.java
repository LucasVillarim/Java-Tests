package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bankline.models.Usuario;

public class LoginServiceTest {
	Usuario user;
	Integer loginLength;
	
	@BeforeEach
	void setupTheTest() {
		user = new Usuario("11094722421", "Lucas Villarim", "lvillarim", "123456");
		loginLength = user.getLogin().length();
		// user = null;
	}
	
	@Test
	@DisplayName("Login must be different from null")
	void loginIsNotEmpty() {
		assertNotNull(user);
	}
	
	@Test
	@DisplayName("login length must be less than 20")
	void testLoginLength() {
		assertEquals(-1, loginLength.compareTo(20));
	}
}

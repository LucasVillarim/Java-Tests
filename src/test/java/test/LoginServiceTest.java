package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bankline.models.Usuario;

public class LoginServiceTest {
	Usuario user;
	Integer loginLength;
	
	public int compare(Integer a, Integer b) {
		return a.compareTo(b);
	};
	
	@BeforeEach
	void setupTheTest() {
		user = new Usuario("11094722421", "Lucas Villarim", "lvillarim", "123456");
		loginLength = user.getLogin().length();
//		user = null;
	}
	
	@Test
	void loginIsNotEmpty() {
		assertNotNull(user);
	}
	
	@Test
	void testLoginLength() {
		assertEquals(-1, this.compare(loginLength, 20));
	}
}

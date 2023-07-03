package in.tamilselvan.doc4you;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.service.UserService;

public class TestCreateUser {
	@Test
	public void testCreateUserWithVaildata() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Tamil");
		newUser.setLastName("Selvan");
		newUser.setEmail("tamil@gmail.com");
		newUser.setPassword("Tamil@12");
		newUser.setActive(true);
		assertDoesNotThrow(() -> {
			userService.create(newUser);
		});
	}

	@Test
	public void testCreateUserWithInvalidataInput() {
		UserService userService = new UserService();
		Exception exception = assertThrows(Exception.class, () -> {

			userService.create(null);
		});
		String exceptedMessage = "invaild user input";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}

	@Test
	public void testCreateUserWithEmailNull() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Tamil");
		newUser.setLastName("Selvan");
		newUser.setEmail(null);
		newUser.setPassword("Tamil@12");
		newUser.setActive(true);

		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	@Test
	public void testCreateUserWithEmailEmpty() {
		UserService userService = new UserService();

		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Tamil");
		newUser.setLastName("Selvan");
		newUser.setEmail("");
		newUser.setPassword("Tamil@12");
		newUser.setActive(true);

		Exception exception = assertThrows(Exception.class, () -> {
			userService.create(newUser);
		});
		String exceptedMessage = "Email cannot be null or empty";
		String actualMessage = exception.getMessage();
		assertTrue(exceptedMessage.equals(actualMessage));
	}
	
	
}

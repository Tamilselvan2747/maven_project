package in.tamilselvan.doc4you.validation;

import in.tamilselvan.doc4you.model.User;

public class UserValidator {

	public static void validate(User user) throws Exception {

		if (user == null) {
			throw new IllegalArgumentException("invaild user input");
		}

		if (user.getEmail() == null || "".equals(user.getEmail().trim())) {
			throw new Exception("Email cannot be null or empty");

		}
		if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
			throw new Exception("password cannot be null or empty");
		}
		if (user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
			throw new Exception("first name cannot be null or empty");
		}
		if(user.getLastName() == null || "".equals(user.getLastName().trim())) {
			throw new Exception("lastname cannot be null or empty");
		}
	}

}

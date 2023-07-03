package in.tamilselvan.doc4you.validation;

import in.tamilselvan.doc4you.model.User;

public class UserValidator {

	public static void validate(User user) throws Exception {

		if (user == null) {
			throw new IllegalArgumentException("invaild user input");
		}
		if ("".equals(user.getEmail().trim())) {
			throw new Exception("User cannot be null");

		}
		if (" ".equals(user.getPassword().trim())) {
			throw new Exception("User cannot be null");
		}
		if (" ".equals(user.getFirstName().trim())) {
			throw new Exception("User cannot be null");
		}
	}

}

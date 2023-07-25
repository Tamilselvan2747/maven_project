package in.tamilselvan.doc4you.validation;

import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		if (user == null) {

			throw new ValidationException("Invalid User Input");
		}

//		if (user.getEmail() == null || "".equals(user.getEmail().trim())) {
//
//			throw new ValidationException("Email cannot be null or empty");
//		}
//
//		if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
//
//			throw new ValidationException("Password cannot be null or empty");
//		}
//
//		if (user.getFirstName() == null || "".equals(user.getFirstName().trim())) {
//
//			throw new ValidationException("First Name cannot be null or empty");
//		}
		
		StringUtil.rejectIfInvaildString(user.getEmail(), "Email");
		StringUtil.rejectIfInvaildString(user.getPassword(), "Password");
		StringUtil.rejectIfInvaildString(user.getFirstName(), "FirstName");
	}

}
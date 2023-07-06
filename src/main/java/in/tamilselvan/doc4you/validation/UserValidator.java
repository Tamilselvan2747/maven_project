package in.tamilselvan.doc4you.validation;

import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.util.StringUtil;

public class UserValidator {

	public static void validate(User user) throws ValidationException {

		if (user == null) {
			throw new ValidationException("invaild user input");
		}


		
		 StringUtil.rejectIfInvalidString(user.getEmail(), "Email");
//	        StringUtil.isValid(user.getEmail()); // Add appropriate validation logic here

	        StringUtil.rejectIfInvalidString(user.getPassword(), "Password");
//	        StringUtil.isValid(user.getPassword()); // Add appropriate validation logic here

	        StringUtil.rejectIfInvalidString(user.getFirstName(), "First Name");
	        StringUtil.rejectIfInvalidString(user.getLastName(), "Last Name");
	}

}

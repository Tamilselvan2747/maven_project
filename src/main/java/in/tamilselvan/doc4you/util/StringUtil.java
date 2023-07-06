package in.tamilselvan.doc4you.util;

import in.tamilselvan.doc4you.exception.ValidationException;

public class StringUtil {
	public static void rejectIfInvalidString(String input, String inputName) throws ValidationException {
        if (input == null || "".equals(input.trim())) {
            throw new ValidationException(inputName.concat(" cannot be null or empty"));
        }
    }

    public static boolean isValid(String emailId) throws ValidationException {
        if (emailId == null || "".equals(emailId.trim())) {
            throw new ValidationException(" Email ID cannot be null or empty");
        }
        return true; 
    }

    public static boolean isInvalid(String emailId) throws ValidationException {
        if (emailId == null || "".equals(emailId.trim())) {
            throw new ValidationException(" Email ID cannot be null or empty");
        }
        return false;
	
}

}

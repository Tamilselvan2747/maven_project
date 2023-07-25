package in.tamilselvan.doc4you.validation;



import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.Task;
import in.tamilselvan.doc4you.util.StringUtil;



public class TaskValidator {

	public static void validate(Task task) throws ValidationException {

		if (task == null) {
			throw new ValidationException("Invalid Task Input");
		}

		StringUtil.rejectIfInvaildString(task.getName(), "Name");
		StringUtil.rejectIfInvalidDate(task.getDueDate(), "Date");

	}

}
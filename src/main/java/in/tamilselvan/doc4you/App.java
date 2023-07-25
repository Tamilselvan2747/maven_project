package in.tamilselvan.doc4you;

import java.time.LocalDate;

import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.Task;
import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.service.TaskService;
import in.tamilselvan.doc4you.service.UserService;

public class App {

	public static void main(String[] args) {

		try {
			UserService userService = new UserService();

			User newUser = new User();

			newUser.setId(12345);
			newUser.setEmail("inba@gmail.com");
			newUser.setFirstName("Inba");
			newUser.setLastName("Lokesh");
			newUser.setPassword("14");
			newUser.setActive(true);

			userService.create(newUser);
			userService.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

//		userService.update();
//		userService.delete();
//		userService.findUserId(12345);

		try {
			TaskService taskService = new TaskService();

			Task newTask = new Task();

			newTask.setId(1233);
			newTask.setName("abcdedf");
			LocalDate updateDuedate = LocalDate.of(2023, 8, 19);
			newTask.setDueDate(updateDuedate);

			newTask.setActive(true);
			taskService.createTask(newTask);
			taskService.getAllTask();
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
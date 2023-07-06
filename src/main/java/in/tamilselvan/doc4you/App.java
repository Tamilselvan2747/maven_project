package in.tamilselvan.doc4you;

import in.tamilselvan.doc4you.model.Task;
import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.service.TaskService;
import in.tamilselvan.doc4you.service.UserService;


public class App {

	public static void main(String[] args) {
		
		
		User newUser = new User();
		newUser.setId(3);
		newUser.setFirstName("Uthra");
		newUser.setLastName("Boopathy");
		newUser.setEmail("uthra@gmail.com");
		newUser.setPassword("Uthra@12");
		newUser.setActive(true);
		
		UserService userService;
		
		try {
			userService = new UserService();

			User newUser1 = new User();
			newUser1.setId(2);
			newUser1.setFirstName("Ramya");
			newUser1.setLastName("Boopathy");
			newUser1.setEmail("ramya@gmail.com");
			newUser1.setPassword("Uthra@12");
			newUser1.setActive(true);
			
			userService.create(newUser);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
//		userService.create(newUser1);
		
		User updateUser = new User();
		updateUser.setId(2);
		updateUser.setFirstName("Ramya");
		updateUser.setLastName("Boopathy");
		updateUser.setEmail("ramys@gmail.com");
		updateUser.setPassword("Uthra@12");
		updateUser.setActive(true);
		
		
//		userService.update(2, updateUser);
//		
//		userService.getAll();
//		
		
		////////////////    FOR TASK   ////////////
		
		
		TaskService taskService;

		try {
			taskService = new TaskService();
			
			Task newTask = new Task();
			newTask.setId(1);
			newTask.setTaskName("Rc");
			newTask.setDueDate("01.10.2023");
			newTask.setActive(true);

			taskService.create(newTask);
			taskService.getAll();


		} catch (Exception e) {
		
			e.printStackTrace();
		}
		

	}

}

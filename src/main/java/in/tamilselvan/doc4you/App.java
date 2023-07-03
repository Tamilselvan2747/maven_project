package in.tamilselvan.doc4you;

import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.service.UserService;

public class App {

	public static void main(String[] args) {
		try {
			UserService userService = new UserService();

			User newUser = new User();
			newUser.setId(001);
			newUser.setFirstName("Tamil");
			newUser.setLastName("Selvan");
			newUser.setEmail("tamil@gmail.com");
			newUser.setPassword("Tamil@12");
			newUser.setActive(true);


				userService.create(newUser);
			
			
			userService.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

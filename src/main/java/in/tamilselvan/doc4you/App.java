package in.tamilselvan.doc4you;

import in.tamilselvan.doc4you.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.create();
		userService.getAll();

	}

}

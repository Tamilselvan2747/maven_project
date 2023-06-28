package in.tamilselvan.doc4you.service;

import in.tamilselvan.doc4you.dao.UserDAO;

import in.tamilselvan.doc4you.model.User;

public class UserService {

	public User[] getAll() {
		
		UserDAO userDao = new UserDAO();
		User[] userList = userDao.findAll();
		
		for(int i=0; i<userList.length;i++) {
			System.out.println(userList[i]);
		}
		return userList;
	}
	
	public void create() {
		
		User newUser = new User();
		newUser.setId(001);
		newUser.setFirstName("Tamil");
		newUser.setLastName("Selvan");
		newUser.setEmail("tamil@gmail.com");
		newUser.setPassword("Tamil@12");
		newUser.setActive(true);
		
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
		
	}
	
}

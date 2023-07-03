package in.tamilselvan.doc4you.service;

import in.tamilselvan.doc4you.dao.UserDAO;

import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.validation.UserValidator;

public class UserService {

	public User[] getAll() {

		UserDAO userDao = new UserDAO();
		User[] userList = userDao.findAll();

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i]);
		}
		return userList;
	}

	public void create(User newUser) throws Exception {
          UserValidator.validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);

	}

	public void update() {
		User updateUser = new User();

		UserDAO userDao = new UserDAO();
		userDao.update(1, updateUser);
	}

	public void delete() {

	}

}

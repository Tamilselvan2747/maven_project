package in.tamilselvan.doc4you.service;

import java.util.Set;


import in.tamilselvan.doc4you.dao.UserDAO;

import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.validation.UserValidator;

public class UserService {

	public Set<User> getAll() {
		UserDAO userDao = new UserDAO();
		Set<User> userList = userDao.findAll();
		for (User name : userList) {
			System.out.println(name);
		}
		return userList;
	}

	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		return userDao.findById(userId);
	}

	public void create(User newUser) throws Exception {
		UserValidator.validate(newUser);
		UserDAO userDao = new UserDAO();
		userDao.create(newUser);
	}

	public void update(int id, User updateUser) {
		UserDAO newUserDao = new UserDAO();
		newUserDao.update(id, updateUser);

	}

	public void delete(int id) {
		UserDAO newUserDao = new UserDAO();
		newUserDao.delete(id);
	}
	
	public User findByEmailId(String email) {
		UserDAO newUserDao = new UserDAO();
		return newUserDao.findByEmailId(email);
	}

}
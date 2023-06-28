package in.tamilselvan.doc4you.dao;

import in.tamilselvan.doc4you.model.User;

public class UserDAO {
public User[] findAll() {
	User[] userList = UserList.listOfUsers;
	return userList;
}

public void create(User newUser) {
	UserList.listOfUsers[0] = newUser;
}
}

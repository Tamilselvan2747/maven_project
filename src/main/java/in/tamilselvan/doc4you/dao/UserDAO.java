package in.tamilselvan.doc4you.dao;

import in.tamilselvan.doc4you.model.User;

public class UserDAO {
	public User[] findAll() {
		User[] userList = UserList.listOfUsers;
		return userList;
	}
/**
 * 
 * @param newUser
 */
	public void create(User newUser) {
//	UserList.listOfUsers[0] = newUser;
		User[] arr = UserList.listOfUsers;

		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if (user == null) {
				arr[i] = newUser;
				break;

			}

		}
	}
	
	/**
	 * 
	 * @param id
	 * @param updateUser
	 */

	public void update(int id, User updateUser) {

		User[] userList = UserList.listOfUsers;

		for (int i = 0; i < userList.length; i++) {

			User user = userList[i];

			if (user == null) {
				continue;
			}
			if (user.getId() == id) {
				user.setFirstName(updateUser.getFirstName());
				user.setLastName(updateUser.getLastName());
				
			}

		}

	}
	/**
	 * 
	 * @param id
	 */
	public void delete(int id) {
		User[] userList = UserList.listOfUsers;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user == null) {
				continue;
				
			}
			if (user.getId() == id) {
				user.setActive(false);			
			}
		}
		
	}
	
	public User findById(int id) {
		User[] userList = UserList.listOfUsers;
		User userMatch = null;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == id) {
				userMatch = user;
				break;
				
			}
			
		}return userMatch;
	}

	public void name() {
		
	}
}

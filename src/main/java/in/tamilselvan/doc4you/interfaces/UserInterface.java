package in.tamilselvan.doc4you.interfaces;

import java.util.Set;

import in.tamilselvan.doc4you.model.User;

public interface UserInterface extends Base {

	public abstract User findByEmailId(String email);

	public abstract int count();

	void update(int id, User updateUser);

	/**
	 * 
	 * @param newUser
	 */
	void create(User newUser);

	void delete(int id);

	void create(Object object);

	void update(int id, Object object);

}
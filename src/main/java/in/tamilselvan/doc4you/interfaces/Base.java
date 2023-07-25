package in.tamilselvan.doc4you.interfaces;
import java.util.Set;

import in.tamilselvan.doc4you.model.User;
public interface Base<T>{
	
	public abstract Set<T> findAll();
	public abstract void create(T object);
	public abstract void update(int id, T object);
	public abstract void delete(int id);
	public abstract T findById(int id);
	void update(int id, User updateUser);
	/**
	 * 
	 * @param newUser
	 */
	void create(User newUser);

}
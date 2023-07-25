package in.tamilselvan.doc4you;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import in.tamilselvan.doc4you.model.User;
import in.tamilselvan.doc4you.service.UserService;


public class TestGetAllUser {
    @Test
	public void getAllUser() {
		UserService userService = new UserService();
		Set<User> arr = userService.getAll();
		System.out.println(arr);
	}
    
    @Test
    public void getById() {
		UserService userService = new UserService();
		User arr = userService.findById(1);
		System.out.println(arr);
    }
}

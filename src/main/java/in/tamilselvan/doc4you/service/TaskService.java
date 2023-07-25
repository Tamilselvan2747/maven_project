package in.tamilselvan.doc4you.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;

import in.tamilselvan.doc4you.dao.TaskDAO;
import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.Task;

import in.tamilselvan.doc4you.validation.TaskValidator;

public class TaskService {

	public Set<Task> getAllTask() {

		TaskDAO taskDao = new TaskDAO();
		Set<Task> taskList = taskDao.findAll();
		for (Task name : taskList) {
			System.out.println(name);
		}

		return taskList;
	}

	public Task findById(int id) {

		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(id);
		System.out.println(task);
		return task;

	}

	public void createTask(Task newTask) throws ValidationException {
		TaskValidator.validate(newTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}

	public void update(int id, Task updateTask) {
		TaskDAO newTaskDao = new TaskDAO();
		newTaskDao.update(id, updateTask);
	}

	public void delete(int id) {
		TaskDAO newUserDao = new TaskDAO();
		newUserDao.delete(id);
	}

	public static LocalDate convertToDate(String dateString) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			LocalDate localDate = LocalDate.parse(dateString, formatter);
			return localDate;
		} catch (Exception e) {
			System.out.println("Invalid date format!");
			return null;
		}
	}
}
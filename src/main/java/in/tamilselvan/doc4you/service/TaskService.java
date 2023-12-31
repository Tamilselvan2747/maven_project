package in.tamilselvan.doc4you.service;

import java.time.format.DateTimeParseException;
import java.util.Set;

import in.tamilselvan.doc4you.dao.TaskDAO;
import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.Task;

import in.tamilselvan.doc4you.validation.TaskValidator;

public class TaskService {
	public Set<Task> getAll() {
		TaskDAO taskDao = new TaskDAO();
		Set<Task> taskList = taskDao.findAll();
		for (Task task : taskList) {
			System.out.println(task);
		}
		return taskList;
	}

	public void create(Task newTask) throws Exception {
		try {
			TaskValidator.Validate(newTask);
		} catch (DateTimeParseException e) {
			throw new ValidationException("Invalid date format or Invalid Date");
		}

		TaskValidator.Validate(newTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);
	}

	public void update(Task updateTask) throws Exception {
		TaskValidator.Validate(updateTask);
		TaskDAO taskDao = new TaskDAO();
		taskDao.update(updateTask);
	}

	public void delete(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(1);
	}

	public Task findById(int taskId) {
		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(1);
		return task;
	}

}
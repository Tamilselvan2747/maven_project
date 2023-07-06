package in.tamilselvan.doc4you.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import in.tamilselvan.doc4you.dao.TaskDAO;
import in.tamilselvan.doc4you.exception.ValidationException;
import in.tamilselvan.doc4you.model.Task;
import in.tamilselvan.doc4you.validation.TaskValidator;

public class TaskService {

	public Task[] getAll() {

		TaskDAO taskDao = new TaskDAO();

		Task[] taskList = taskDao.findAll();

		for (int i = 0; i < taskList.length; i++) {

			System.out.println(taskList[i]);

		}

		return taskList;
	}

	public void create(Task newTask) throws Exception {

//		TaskValidator.validate(newTask);

		try {
			TaskValidator.validate(newTask);

		} catch (ValidationException e) {

			throw new ValidationException(e.getMessage());
		
		} catch (Exception e) {

			throw new ValidationException("Invalid date or invalid date format");

		}

		TaskDAO taskDao = new TaskDAO();
		taskDao.create(newTask);

	}

	public void update(int id, Task updateTask) {

		TaskDAO taskDao = new TaskDAO();
		taskDao.update(1, updateTask);

	}

	public void delete() {

		Task deleteTask = new Task();

		TaskDAO taskDao = new TaskDAO();
		taskDao.delete(1);

	}

	public Task findById(int id) {
		TaskDAO taskDao = new TaskDAO();
		Task task = taskDao.findById(id);
		return task;
	}

} 
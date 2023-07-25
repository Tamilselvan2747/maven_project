package in.tamilselvan.doc4you.dao;

import in.tamilselvan.doc4you.model.Task;
import in.tamilselvan.doc4you.model.User;

import java.util.Set;
import in.tamilselvan.doc4you.interfaces.TaskInterface;

public class TaskDAO implements TaskInterface {

	public Set<Task> findAll() {

		Set<Task> taskList = TaskList.listOfTasks;

		return taskList;
	}

	@Override
	public void create(Task newTask) {

		Set<Task> list = TaskList.listOfTasks;

		list.add(newTask);
	}

	@Override
	public void update(int id, Task updateTask) {

		Set<Task> list = TaskList.listOfTasks;

		for (Task name : list) {

			Task task = name;

			if (task.getId() == id) {
				task.setName(updateTask.getName());
				task.setDueDate(updateTask.getDueDate());
				break;
			}
		}
	}

	@Override
	public void delete(int id) {

		Set<Task> list = TaskList.listOfTasks;

		for (Task name : list) {

			Task task = name;

			if (task.getId() == id) {
				task.setActive(false);
				break;
			}
		}
	}

	@Override
	public Task findById(int taskId) {

		Set<Task> taskList = TaskList.listOfTasks;

		Task taskMatch = null;

		for (Task name : taskList) {

			Task task = name;

			if (task.getId() == taskId) {
				taskMatch = task;
				break;
			}
		}
		return taskMatch;
	}

	@Override
	public void update(int id, User updateUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(User newUser) {
		// TODO Auto-generated method stub
		
	}

}
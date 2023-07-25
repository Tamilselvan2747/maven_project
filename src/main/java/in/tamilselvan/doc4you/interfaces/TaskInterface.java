package in.tamilselvan.doc4you.interfaces;

import java.util.Set;

import in.tamilselvan.doc4you.model.Task;

public interface TaskInterface extends Base<Task> {

	void update(int id, Task updateTask);

}
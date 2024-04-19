package DoList;

import java.util.ArrayList;
import java.util.List;

public class toDoList implements DoInterface {

	private List<String> tasks;
	
	public toDoList () {
		tasks = new ArrayList<String>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
		System.out.println("Task \"" + task + "\" added.");
		}
	
	public void removeTask (String task) {
		if(tasks.remove(task)) {
		System.out.println("Task \"" + task + "\" removed.");	
		} else {
			System.out.println("Task not found");
		}
	}
	
	public void completedTask (String task) {
		if(tasks.contains(task)) {
		System.out.println("Task \"" + task + "\" completed.");
		}else {
			System.out.println("Task not found");
		}
	}
	public void tasksDisplay() {
		System.out.println("Tasks");
		if (tasks.isEmpty()) {
			System.out.println("List is empty");
		}
		for (String t : tasks) {
			System.out.println("- " + tasks);
		}
		
	}
	public void clearTask() {
		tasks.clear();
		System.out.println("All tasks cleared. ");
	}
		
}


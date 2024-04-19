package DoList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		toDoList toDo = new toDoList();
		
		while (true) {
			try {
				
			System.out.println("Select option");
			System.out.println("1 - add task");
			System.out.println("2 - remove task");
			System.out.println("3 - complet task");
			System.out.println("4 - clear all task");
			System.out.println("5 - End program");
			
			int choice = s.nextInt();
			s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter your task. If you want a stop, write 'end'.");
				String enterTask = s.nextLine();
				while (!enterTask.equalsIgnoreCase("end")) {
					toDo.addTask(enterTask);
					enterTask = s.nextLine();
					
				}
				break;
			case 2:
				System.out.println("Enter the task you want to remove");
				String removeTask = s.nextLine();
				toDo.removeTask(removeTask);
				
				break;
				
			case 3:
				System.out.println("Enter the task you want to complete");
				String completeTask = s.nextLine();
				toDo.removeTask(completeTask);
				
				break;
			case 4:
				toDo.clearTask();
				
				break;
			case 5:
				System.out.println("Exiting program.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalide choice.");
			}
			toDo.tasksDisplay();
			
			} catch (InputMismatchException e) {
				System.err.println("Invalid input. Please enter a number.");
				s.next();
			}
		}
		
	}

	
}

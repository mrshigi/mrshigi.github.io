/*
 *Sean Raudat for CSCE 146, HW03, TASKS ON TASKS ON TASKS 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TaskManagerFrontEnd {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager(); // create a TaskManager object
        Scanner sr = new Scanner(System.in);
        boolean quit = false;
        while(quit == false)
		{
			//Prompt the user
        	 System.out.println("Welcome to the Task Organizer!\r\n"
             		+ "Enter 1. To Add a Task\r\n"
             		+ "Enter 2. To Remove a Task\r\n"
             		+ "Enter 3. To Print Tasks To Console\r\n"
             		+ "Enter 4. To Read from a Task File\r\n"
             		+ "Enter 5. To Write to a Task File\r\n"
             		+ "Enter 9. To Quit ");
			int input = sr.nextInt();//take the user input
			switch(input)
			{
			case 9:
				quit = true;
				break;
			case 1:
				System.out.println("Enter the task's priority");
				int priority = sr.nextInt();
				System.out.println("Enter the task's action");
				String action = sr.next();
				manager.addTask(action, priority);
				break;
			case 2:
				System.out.println("Enter the task's priority");
				int removepriority = sr.nextInt();
				System.out.println("Enter the task's action");
				String removeAction = sr.next();
				manager.removeTask(removeAction, removepriority);
				break;
			case 3:
				manager.displayTasks();
				break;
			case 4:
				System.out.println("Enter the file's name");
				String fileName = sr.next();
				TaskManager.readTasksFromFile(fileName);
				break;
			case 5:
				System.out.println("Enter the file's name");
				String WritefileName = sr.next();
				TaskManager.writeTasksToFile(WritefileName);
			}
		}
    }
}

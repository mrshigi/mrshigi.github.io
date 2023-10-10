/*
 *Sean Raudat for CSCE 146, HW03, TASKS ON TASKS ON TASKS 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import GenLL.Node;
public class TaskManager {
    private static final int MAX_PRIORITY = 5; 
    private GenLL<Task>[] taskLists; // array of linked lists to store tasks
    public TaskManager() 
    {
        taskLists = new GenLL[5];
        for (int i = 0; i <= MAX_PRIORITY; i++) 
        {
            taskLists[i] = new GenLL<Task>(); //initialize each index of taskLists array with a new linked list object
        }
    }
    public void addTask(String action, int priority) 
    {
        if (priority > MAX_PRIORITY || priority < 1) 
        { // check if priority is within the allowed range
            System.out.println("Invalid priority value.");
            return;
        }
        taskLists[priority].add(new Task(action, priority));
        System.out.println("Task added: " + action + ", Priority: " + priority);
    }
    //remove a task with action and priority
    public void removeTask(String action, int priority) 
    {
        if (priority > MAX_PRIORITY || priority < 1) 
        { // check if priority is within the allowed range
            System.out.println("Invalid priority value.");
            return;
        }
        boolean removed = taskLists[priority].remove(new Task(action, priority));
        if (removed) 
        {
            System.out.println("Task removed: " + action + ", Priority: " + priority);
        } 
        else 
        {
            System.out.println("Task not found: " + action + ", Priority: " + priority);
        }
    }
    
    public void displayTasks() {
    	GenLL<Task>[] organizedTasks;
        for (int i = 0; i < taskLists.length; i++) {
            System.out.println("Priority " + i + ":");
            GenLL<Task> task = taskLists[i];
            while (task != null) 
            {
                System.out.println(task.getData().toString());
                task = .getNext();
            }
        }
    }
    
    
    
    
   /*public void displayTasks() 
    {
        System.out.println("Tasks:");
        for (int i = MAX_PRIORITY; i >= 1; i--) 
        { 
            if (taskLists[i].getSize() > 0) 
            {
                System.out.println("Priority " + i + ":");
                taskLists[i].display();
            }
        }
    } */
    public static void readTasksFromFile(String fileName) 
    {
    	GenLL<Task>[] organizedTasks;
    	organizedTasks = new GenLL[5];
    	try 
        {
            BufferedReader sr = new BufferedReader(new FileReader(fileName));// as with all my assignments the scanners and readers will be sr
            String line;
            while ((line = sr.readLine()) != null) 
            {
                String[] parts = line.split("\t");
                if (parts.length == 2) 
                {
                    int priority = Integer.parseInt(parts[0]);
                    String action = parts[1];
                    Task task = new Task(action, priority);
                    if (priority >= 0 && priority < organizedTasks.length) 
                    {
                        if (!organizedTasks[priority].contains(task)) 
                        {
                        	organizedTasks[priority].add(task);
                        } 
                        else 
                        {
                            System.out.println("Task already exists: " + task);
                        }
                    }
                }
            }
            sr.close();
        } 
    	catch (FileNotFoundException e) 
    	{
            System.out.println("File not found: " + fileName);
        } 
    	catch (IOException e) 
    	{
            System.out.println("Error reading file: " + fileName);
        } 
    	catch (NumberFormatException e) 
    	{
            System.out.println("Invalid task file format: " + fileName);
        }
    }
    public void writeTasksToFile(String fileName) 
    {
    	GenLL<Task>[] organizedTasks;
    	organizedTasks = new GenLL[5];
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < organizedTasks.length; i++) 
            { 
            	organizedTasks[i] = new GenLL<Task>();
               {
            	   Task task = new Task(action, priority);
                   writer.write(i + "\t" + Task.setPriority() + "\t" + Task.setAction() + "\n");
               }
             }
            writer.close();
            System.out.println("Tasks written to file " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("Error writing tasks to file " + fileName + ": " + e.getMessage());
        }
    }  
}

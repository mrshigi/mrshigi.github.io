/*
 *Sean Raudat for CSCE 146, HW03, TASKS ON TASKS ON TASKS 
 */
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Task class with action and priority
public class Task 
{
    public String action; // action to perform
    public int priority; // priority of task

    // constructor to initialize action and priority
    public Task(String action, int priority) 
    {
        this.action = action;
        this.priority = priority;
    }
    public String getAction() 
    {
        return action;
    }
    public void setAction(String action) 
    {
        this.action = action;
    }
    // getter for priority
    public int getPriority() 
    {
        return priority;
    }
    public void setPriority(int priority) 
    {
        this.priority = priority;
    }
    // toString method to return string representation of Task object
    @Override
    public String toString() {
        return "Action: " + action + ", Priority: " + priority;
    }

}

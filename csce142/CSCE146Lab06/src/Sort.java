/*
 *Sean Raudat for CSCE 146, Lab06
 */
import java.util.Scanner;

public class Sort
{
    public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);//Scanner for Sean raudat as per usual
        String arr[] = new String[100];// following this statement The Strings must be stored inside of a data structure; either an Array or a Data Structure of your own creation
        String choice = "yes";
        int capacity = 100;
        int count = 0;
        String line;
        System.out.println("Enter any number of strings and I will sort by SORT's. ");
        System.out.println("Once you’re done entering sentences enter quit :"); 
        do //does this loop so we can print and restart the program 
        {
            do 
            {
                line = sr.nextLine();
                if(!line.equalsIgnoreCase("quit")) //break loop
                {
                    if(count == capacity)
                    {
                        //create a new array with double the capacity to sort
                        capacity = 2*capacity;
                        String newArr[] = new String[capacity];
                        for(int i=0;i<count;i++)
                        {
                            newArr[i] = arr[i];
                        }
                        arr = newArr;
                    }
                    arr[count] = line;
                    count++;
                }
            }
            while (!line.equalsIgnoreCase("quit"));
            sorting(arr, 0, count-1);
            System.out.println("sort SORTED!");
            for(int i=0; i<count;i++)
            {
                System.out.println(arr[i]);
            }
            System.out.println("Would you like to sort more strings? ");
            choice = sr.nextLine();
        } 
        while (choice.equalsIgnoreCase("yes"));
        System.out.println("Goodbye!");
        sr.close();  
    }
    static int countSort(String str)
    {
        if(str == null) return 0;
        str = str.toLowerCase();
        int count = 0, startIndex = 0;
        while ((startIndex = str.indexOf("sort", startIndex)) != -1 )
        {
            count++;
            startIndex++;
        }
        return count;
    }
    static void swapElements(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(String[] arr, int left, int right)
    {
        String indexOfPivot = arr[right];
        int i = (left - 1);
        for(int j = left; j <= right - 1; j++)
        {
            if (countSort(arr[j]) < countSort(indexOfPivot))
            {
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i + 1, right);
        return (i + 1);
    }
    static void sorting(String[] arr, int left, int right)
    {
        if (left < right)
        {
            int pivotElement = partition(arr, left, right);
            sorting(arr, left, pivotElement - 1);
            sorting(arr, pivotElement + 1, right);
        }
    }
}
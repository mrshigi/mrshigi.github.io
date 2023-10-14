//Sean Raudat for CSCE 145 Lab 06
package lab06;
import java.util.Scanner;
public class lab06 {
public static void insertionSort(int[] x)
{
	for (int i=1;i<x.length;i++)
	{
		int num1 = x[i];
		int j=i-1;
		while (j>=0 && num1<x[j])
		{
			x[j+1]=x[j];
			j--;
		}
	        x[j+1]=num1;
	    }
	}
public static void printArr(int[] x){
	System.out.print('{');
	for(int i = 0; i< x.length ; ++i) {
		if(i<x.length-1) {
			System.out.print(x[i]+", ");
		}
		else {
			System.out.print(x[i]);
		}
	}
	System.out.print('}');
}
public static void main(String[] args)
{	
/*System.out.println("Please enter a list of numbers");
Scanner in = new Scanner(System.in);
int[] x = new int[args.length];
for(int i =0; i<args.length; ++i) 
{
	x[i] = Integer.parseInt(args[i]);
}*/
int[] numList ={4,2,3,2,1,5};
insertionSort(numList);
 for (int num:numList)
  {
	 System.out.println(num);
		//printArr(numList);
    	}
    	}	
	}	

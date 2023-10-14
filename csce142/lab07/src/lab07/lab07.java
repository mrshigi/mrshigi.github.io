//Lab07 for CSCE 145 Sean Raudat
package lab07;
import java.util.Scanner;
public class lab07 {
	private static void print(String s) 
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		print("Welcome to the above average temperature tester program.");
		double temp[] = new double[10];
		for(int i=0; i<temp.length; i++)
		{
			print("Please enter the temp for day "+(i+1)+": ");
			temp[i] = in.nextDouble();
		}
		double sumTemp = 0;
		for(int i=0; i<temp.length; i++){
			sumTemp = sumTemp + temp[i];
			}
		double avgTemp = sumTemp/temp.length;
		print("The average temperature was "+avgTemp);
		print("The days that were above average were: ");
		for(int i=0; i<temp.length; i++)
		{
			if(avgTemp < temp[i])
			{
			print("Day "+(i+1)+" with "+temp[i]);
			}
		}
		print("DONE!");
	}
}


/*
 *Sean Raudat for CSCE 146, HW00
 */
import java.util.*;
import java.lang.*;
public class HW00 {
	public static void main(String[] args) {
		/* I am willing to lose 5 points for the "coding style" meaning I am just running my code thru 
		 * the main method because I am sick (mancold and sore throat on god)
		 * and lazy, but i can see where each vector operation could be a method 
		 * that is called into main making it alot cleaner and easier on the compiler
		 */
		Scanner sr = new Scanner(System.in); //i use sr for sean raudat
		int input; 
		int vectorSize; 
		double[] vector1;
		double[] vector2;
		double magnitude;
	
		System.out.println("Welcome to the Vector Operations Program!");
		/* Print the "Welcome" sentence outside do while loop as it
		 * needs to be printed only one time at the begining and not each iteration 
		 * (playthru? calculation? loop? you get what i'm saying) 
		 */
		do {
			System.out.println("Enter 0. To Add 2 Vectors of the same size");
			System.out.println("Enter 1. To Subtract 2 Vectors of the same size");
			System.out.println("Enter 2. To Find the Magnitude of a Vector");
			System.out.println("Enter 3. To Quit");
			input = sr.nextInt();	
			/*
			 * ADDITION SECTION when user enters 0
			 */
			if(input == 0)
			{
				System.out.println("Enter the size of the Vectors");
				vectorSize = sr.nextInt();
				if(vectorSize <= 0)
					// Shows "Invalid Size" if the vector size is less than or equal to 0
					{
					System.out.println("Invalid Size");
					} 
				else 
				//if the size is valid (100 emoji) then does vector addition
					{
					System.out.println("Enter values for the first vector, decimals included");
					vector1 = new double[vectorSize];
					for(int i=0; i<vectorSize; i++)
						vector1[i] = sr.nextDouble();
					System.out.println("Enter values for second vector, decimals included");
					vector2 = new double[vectorSize];
					for(int i=0; i<vectorSize; i++)
						vector2[i] = sr.nextDouble();
					System.out.println("Result:");
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector1[i]);
					System.out.println("+");
					/*
					 * i did this on the next line as i could not figure out a good way to display
					 * the vectors side by side like the example. This is the same for subtraction 
					 * as well
					 */
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector2[i]);
					System.out.println("=");
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector1[i] + vector2[i]);
					}
				}
			/*
			 * SUBTRACT SECTION when user enters 1
			 */
			else if(input == 1)
			{
				System.out.println("Enter the size of the Vectors");
				vectorSize = sr.nextInt();
				if(vectorSize <= 0) 
				{
					System.out.println("Invalid Size");
				} 
				else
				{
					System.out.println("Enter values for Vector1, decimals included");
					vector1 = new double[vectorSize];
					for(int i=0; i<vectorSize; i++)
						vector1[i] = sr.nextDouble();
					System.out.println("Enter values for Vector2, decimals included");
					vector2 = new double[vectorSize];
					for(int i=0; i<vectorSize; i++)
						vector2[i] = sr.nextDouble();
					System.out.println("Result:");
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector1[i]);
					System.out.println("-");
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector2[i]);
					System.out.println("=");
					for(int i=0; i<vectorSize; i++)
						System.out.println(vector1[i] - vector2[i]);
					}
				}
			/*
			 * MAGNITUUDE SECTION aka when user enters 2
			 */
			else if(input == 2) 
			{
				System.out.println("Enter the size of the Vector");
				vectorSize = sr.nextInt();
				if(vectorSize <= 0) 
				{
					System.out.println("Invalid Size");
					// prints "Invalid Size" if the vector size is less than or equal to 0
					}
				else
				{
					System.out.println("Enter values for Vector, decimals included");
					vector1 = new double[vectorSize];
					for(int i=0; i<vectorSize; i++)
						vector1[i] = sr.nextDouble();
					magnitude = 0;
					for(int i=0; i<vectorSize; i++)
						magnitude += vector1[i]*vector1[i];
					magnitude = Math.sqrt(magnitude); 
					/* This is where the import for java lang is used to take the square root of 
					 * the "magnitude" value which contains the
					 * sum of squares of all the values in the vector that is created
					 * in the previous line
					 */
					System.out.println("The magnitude is: " + magnitude);
					}
				}
			/*
			 * EXIT SECTION aka when user enters 3
			 */
			else if(input == 3)
			{
				System.out.println("thanks for using my vector calculator!");
				}
			} while(input != 3); 
			/* This makes sure that program keeps running and prompts the user until it is equal to 3
			 * then and only then will it terminate and break the loop 
			 */
		}
	}
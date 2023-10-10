package lab08;

import java.util.Scanner;
public class StringHelperDriver {
	/**
	 * This class is the main method and is where the helper method is called in to replace vowels,
	 * mash strings, and calculate string weight
	 * 
	 * @author Sean Raudat
	 *
	 */
	private static void print(String s) 
	{
		/**
		 * This method makes print easier bc i am lazy
		 * 
		 * @author Sean Raudat
		 *
		 */
		System.out.println(s);
		
	}
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	double selection;
	int num=0;
	/**
	 * This is the main method and is where the helper method is called in to replace vowels,
	 * mash strings, and calculate string weight, a loop is included to continue the program
	 * 
	 * @author Sean Raudat
	 *
	 */
	print("Welcome to the String helper!"
			+ "\n How may I help you today?");
	do{
	print(" [1] for replaceVowelsWith()"
			+ "\n [2] for weight()"
			+ "\n [3] for mashStrings()"
			+ "\n [4] to quit");
	print("Your Selection:");
	selection = in.nextDouble();
	if(selection==1)
	{
		print("Base word:");
		String s = in.next();
		print("Replace vowels with:");
		String r = in.next();
		print("Result is: " + StringHelper.replaceVowelsWith(s,r));
	}
	if(selection==2) {
		print("word:");
		String s = in.next();
		double weight = StringHelper.weight(s);
		print("Result is: " + weight);
	}
	if(selection==3) {
		print("word one:");
		String s1 = in.next();
		print("word two:");
		String s2 = in.next();
		print("Result is: " + StringHelper.mashStrings(s2,s1));
	}
	++num;
	 num %=4;
	}while(selection!=4);
}
}



		
	



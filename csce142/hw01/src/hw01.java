//HW01, Sean Raudat for CSCE 145
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class hw01 {

public static void main(String[] args) {
	ArrayList<Integer> user = new ArrayList<Integer>();
	int i2 = cmdnumbers(args);
	user.add(i2);
	System.out.println("Please enter a list of numbers,"
      		+ "\n one per line. Enter a 0 then blank line to end input."
			+ "\n (max 100 numbers) ");
	int num;
	Scanner in = new Scanner(System.in);
	while ((num = in.nextInt()) > 0) {
		user.add(num);
		Collections.sort(user);
		} 
	System.out.println(user);
	System.out.println("Would you like to do"
      		+ "\n 1. mean,"
			+ "\n 2. median,"
			+ "\n 3. mode,"
			+ "\n 4. max,"
			+ "\n 5. min,"
			+ "\n 6. all?"
			+ "\n (please pick a number)");
	int input2 = in.nextInt();
	if(input2 == 1) {
		double mean = Average(user);
		System.out.println("The mean is " + mean);
	}
	if(input2 == 2) {
		double median = Median(user);
		System.out.println("The median is " + median);
	}
	if(input2 == 3) {
		int mode = Mode(user);
		System.out.println("The mode is " + mode);
	}
	if(input2 == 4) {
		int max = Max(user);
		System.out.println("The max is " + max);
	}
	if(input2 == 5) {
		int min = Min(user);
		System.out.println("The min is " + min);
	}
	if(input2 == 6) {
	double mean = Average(user);
	System.out.println("The mean is " + mean);
	double median = Median(user);
	System.out.println("The median is " + median);
	int mode = Mode(user);
	System.out.println("The mode is " + mode);
	int max = Max(user);
	System.out.println("The max is " + max);
	int min = Min(user);
	System.out.println("The min is " + min);
	}
	}

public static int cmdnumbers(String[] args) 
{

int i1=0;
String line = args;
String[] numberStrs = line.split(" ");
int[] numbers = new int[numberStrs.length];
for(int i = 0;i < numberStrs.length;i++)
{
	i1=i;
   numbers[i] = Integer.parseInt(numberStrs[i]);
}
return numbers[i1];
}
private static double Average(ArrayList <Integer> user) {
    double sum = 0;
    for (Integer list : user) {
        sum += list;
    }
    return sum / user.size();
}
private static int Min (ArrayList<Integer> user){
	Collections.sort(user);
	return user.get(0);
    }
private static int Max (ArrayList<Integer> user){
	int n = user.size();
	int max = user.get(0);
    for (int i = 1; i < n; i++) 
    {
        if (user.get(i) > max) 
        {
            max = user.get(i);
        }
    }
	return max;
}
public static int Mode(ArrayList<Integer> user){
	int mode = user.get(0);
	int count = 0;
	int skip = 0;
	for (int i = 0; i < user.size(); i++)
	{
		int tempCount = 0;
		for(int n = i; n< user.size(); n++)
		{
			if( user.get(n) == user.get(i))
			{
				tempCount++;
				skip = n;
			}
		}
	if(tempCount > count) 
	{
		count = tempCount;
		mode = user.get(i);
	}
	i= skip;
	}
	return mode;
	}
public static double Median(ArrayList<Integer> user) {
    Collections.sort(user);
    if (user.size() % 2 == 1)
        return user.get((user.size() + 1) / 2 - 1);
    else {
        double lower = user.get(user.size() / 2 - 1);
        double upper = user.get(user.size() / 2);
        return (lower + upper) / 2.0;
    }
}
}

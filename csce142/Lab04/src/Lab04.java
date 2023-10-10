import java.util.Scanner;
import java.util.Random;
//Sean Raudat for CSCE 145
public class Lab04 {
private static void print(String s) 
	{
		System.out.println(s);
	}
public static void main(String[] args)
	{
		print("Welcome to the boolean logic quiz");
		print("Enter answer or \"quit\" to quit");
		Scanner kb = new Scanner(System.in);
		String ans = "";
		int num = (int)(Math.random()*7);
		while(!ans.equals("quit"))
		{
		Random b = new Random();
		Random c = new Random();
		boolean random1 = b.nextBoolean();
		boolean random2 = c.nextBoolean();
		switch(num)
			{	
			case 1:
				System.out.println(random1+" && "+random2+" == ");
				boolean ans1 = random1 && random2;
				ans = kb.nextLine();
				boolean ans2=Boolean.parseBoolean(ans);
				if(ans2==ans1) 
				{
				print("correct");
				break;
				}
				else 
				{
				print("sorry, you are wrong");
				break;
				}
			case 2:
				System.out.println(random1+" & "+random2+" == ");
				boolean ans3 = random1 & random2;
				ans = kb.nextLine();
				boolean ans4=Boolean.parseBoolean(ans);
					if(ans4==ans3) 
					{
						print("correct");
						break;
					}
					else 
					{
						print("sorry, you are wrong");
						break;
					}
			case 3:
				System.out.println("!"+random1+" == ");
				boolean ans5 = !random1;
				ans = kb.nextLine();
				boolean ans6=Boolean.parseBoolean(ans);
				if(ans5==ans6) 
				{
					print("correct");
					break;
				}
				else 
				{
					print("sorry, you are wrong");
					break;
				}
			case 4:
				System.out.println(random1 +" || " +random2+" == ");
				boolean ans7 = random1 || random2;
				ans = kb.nextLine();
				boolean ans8 = Boolean.parseBoolean(ans);
				if(ans7==ans8) 
				{
					print("correct");
					break;
				}
				else 
				{
					print("sorry, you are wrong");
					break;
				}
			case 5:
				System.out.println(random1+" ^ "+ random2+" == ");
				boolean ans9 = random1 ^ random2;
				ans = kb.nextLine();
				boolean ans10 = Boolean.parseBoolean(ans);
				if(ans10==ans9) 
				{
					print("correct");
					break;
				}
				else 
				{
					print("sorry, you are wrong");
					break;
				}
			case 6:
				System.out.println(random1+" | "+ random2+" == ");
				boolean ans11 = random1 | random2;
				ans = kb.nextLine();
				boolean ans12 = Boolean.parseBoolean(ans);
				if(ans11==ans12) 
				{
					print("correct");
					break;
				}
				else 
				{
					print("sorry, you are wrong");
					break;
				}
			}
			++num;//idiomatic way to increment a counter
			num %=7 ;//num never gets to 2, change to match number questions
			}
		}
	}

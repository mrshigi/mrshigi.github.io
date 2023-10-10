import java.util.Scanner;
//Sean Raudat for CSCE 145
public class lab03 {
	private static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String ans = "";
		int num = 0;
		while(!ans.equals("quit"))
		{
			switch(num) 
			{
			case 1:
				print("4 facts about if statements ");
				print("[Enter] to continue or \"quit\" to quit");
				  ans = kb.nextLine();
				 		print("ifs:"
				 				+ "\n>have 1 \"if\" part, 0-many \"else if\"s, and possibly an \"else\" "
				 				+ "\n>ifs are braching statements"
				 				+ "\n>do their tests in a top to bottom order"
				 				+ "\n>only one test or else will \"pass\"");
				  print("[Enter] to continue or \"quit\" to quit");
				 ans = kb.nextLine();
				 break;
			case 2:
				print("true && false ==");
				ans = kb.nextLine();
				print("false");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 3:
				print("true && true ==");
				ans = kb.nextLine();
				print("true");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				 break;
			case 4:
				print("!true =="); 
				ans = kb.nextLine();
				print("false");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 5:
				print("false || true == ");
				ans = kb.nextLine();
				print("true");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 6:
				print("(2) facts about for statements");
				ans = kb.nextLine();
				print("for:"
					 		+ "\n>A for statement executes the body of a loop a fixed number of times"
					 		+ "\n>Very useful for Arrays");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 7:
				print("(4)facts about break statements");
				ans = kb.nextLine();
				print("\n>A break statement can be used to end a loop immediately."
					 		+ "\n>The break statement ends only the innermost loop or switch statement that contains the break statement."
					 		+ "\n>break statements make loops more difficult to understand."
					 		+ "\n>Use break statements sparingly (if ever).");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 8:
				print("(2) facts about the exit method");
				ans = kb.nextLine();
				print("\n>A program can be terminated normally by System.exit(0);"
						+ "\n>A program can be terminated abnormally by System.exit(1);");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 9:
				print("(4) facts about if-else statements");
				ans = kb.nextLine();
				print("\n>An if-else statement can contain any sort of statement within it"
						+ "\n>An if-else may be nested within the \"if\" part."
						+ "\n>An if-else may be nested within the \"else\" part."
						+ "\n>An if-else may be nested within both parts.");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 10:
				print("true ^ false ==");
				ans = kb.nextLine();
				 print("true");
				 print("[Enter] to continue or \"quit\" to quit");
					ans = kb.nextLine();
					break;
			case 11:
				print("false ^ false ==");
				ans = kb.nextLine();
				print("false");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			case 12:
				print("(2) Precedence Rules");
				ans = kb.nextLine();
				print("\n>Operations with higher precedence are performed before operations with lower precedence"
				+ "\n>Operations with equal precedence are done left-to-right (except for unary operations which are done right-to-left).");
				print("[Enter] to continue or \"quit\" to quit");
				ans = kb.nextLine();
				break;
			}
			++num;//idiomatic way to increment a counter
			num %=13 ;//num never gets to 2, change to match number questions
			}
		}
	}
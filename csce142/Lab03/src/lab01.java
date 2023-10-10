import java.util.Scanner;
public class lab01 {
	private static void print(String s) {
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String ans = "";
		int num = 0;	
		do{
			print("4 facts about if statements ");
			  print("[Enter] to continue or \"quit\" to quit");
			  ans = kb.nextLine();
			  if(ans.equals("")) {
			 		print("ifs:"
			 				+ "\n>have 1 \"if\" part, 0-many \"else if\"s, and possibly an \"else\" "
			 				+ "\n>ifs are braching statements"
			 				+ "\n>do their tests in a top to bottom order"
			 				+ "\n>only one test or else will \"pass\"");}
			 print("[Enter] to continue or\"quit\" to quit");
			 ans = kb.nextLine();//get last input value
			 if(ans.equals("")) {
				 print("true && false ==");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("false");
				 print("[Enter] to continue or\"quit\" to quit");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("true && true ==");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("true");
				 print("[Enter] to continue or\"quit\" to quit");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("!true ==");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("false");
				 print("[Enter] to continue or\"quit\" to quit");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("false || true == ");}
			 ans = kb.nextLine();
			 if(ans.equals("")) {
				 print("true");
				 print("[Enter] to continue or\"quit\" to quit");}
			 ++num;//idiomatic way to increment a counter
			 num %=5;//num never gets to 2, change to match number questions
			 }while(!ans.equals("quit"));
		}
	}
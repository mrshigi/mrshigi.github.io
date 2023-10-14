package hw00extra;

	//Sean Raudat for CSCE 145, HW00
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	public class hw00extra {
		private static void print(String s) 
		{
			System.out.println(s);
		}
			private static int readeez(String s) 
			{
			        int number = 0;
			        switch(s)
			        {
			            case "one":
			                number = 1;
			                break;
			            case "two":
			                number = 2;
			                break;
			            case "three":
			            	number = 3;
			            	break;
			            case "four":
			            	number = 4;
			            	break;
			            case "five":
			            	number = 5;
			            	break;
			            case "six":
			            	number = 6;
			            	break;
			            case "seven":
			            	number = 7;
			            	break;
			            case "eight":
			            	number = 8;
			            	break;
			            case "nine":
			            	number = 9;
			            	break;
			            case "ten":
			            	number = 10;
			            	break;  
			        }
			        return number;
			}
		public static void main(String[] args) {	
			String input3 = ("yes");
				do{
		Scanner in = new Scanner(System.in);
		print("Enter a problem, e.g. two plus two, with spaces");
		 boolean isValidInput = true;
		 long result = 0;
		 long finalResult = 0;
		 List<String> allowedStrings = Arrays.asList
				 ("zero","one","two","three","four","five","six","seven",
						 "eight","nine","ten","plus","minus","times","over","yes");
		 String input1 = in.nextLine();
		 { 
			 if(input1 != null && input1.length()> 0)
				 {
				 input1 = input1.toLowerCase();
				 String[] splittedParts = input1.split("\\s+");
				 int result1 = readeez(splittedParts[0]);
				 int result2 = readeez(splittedParts[2]);
				 for(String str : splittedParts)
					 {
					 if(!allowedStrings.contains(str)){
						 isValidInput = false;
						 print("Please enter:"
							 		+ " 1) \n>Single digit words"
							 		+ " 2) \n>Valid operations");
						 break;
					 }
				}
				 if(isValidInput)
				 {
					 for(String str : splittedParts)
					 {
						 if(str.equalsIgnoreCase("plus")) {
							 result += result1 + result2;
							 finalResult += result;
							 result=0;
							 System.out.println(input1+" equals "+finalResult);
						 }
						 else if(str.equalsIgnoreCase("minus")) {
							 result += result1 - result2;
							 finalResult += result;
							 result=0;
							 System.out.println(input1+" equals "+finalResult);
						 } 
						 else if(str.equalsIgnoreCase("times")) {
							 result += result1 * result2;
							 finalResult += result;
							 result=0;
							 System.out.println(input1+" equals "+finalResult);
						 } 
	        else if(str.equalsIgnoreCase("over")) {
	        	result += (result1 / result2);
	        	 finalResult += result;
	        	    result=0;
	        	int result3 = (result1 % result2);
	        	System.out.println(input1+" equals "+finalResult+" with a remainder of "+ result3);
	        				}
	    				}
					}	
				 }
			  print("Would you like to do another?:\r\n"
		 			+ "yes\r\n "
		 			+ "no");
		 	String input2 = in.nextLine();
		 	if(input2.equals("no")) {
		 		print("Thank you for using my calculator");
		 		break;}
		 		}
			}while(input3.equals("yes"));				
		}
	}
import java.util.Scanner;
import java.util.Arrays;
public class ManyLoops {
  public static int smallestPowerOf2GTOE(int num) {
	  int pow2 = 1;
  	while(pow2<num) 
  	{
  		pow2 *= 2;
  	}
  	return pow2;
  }
  public static int greatestPowerOf2LTOE(int num) {
	int pow2;
	for(pow2=1;2*pow2<=num;) 
	  {
		pow2=pow2*2;
	  } 
	  return pow2;
  }
  public static int  DIYDivide(int a, int b){
	  if (a == 0)
          return 0;
      if (b == 0)
          return Integer.MAX_VALUE;
      int quotient = 0;
      while (a >= b)
      {
          a = a - b ;
          quotient++ ;
      }
      return quotient;
  }
  public static int DIYindexOf(String s, char c){
	int occur = -1;
	int i = -1;
	for(i=0;i<s.length();i++) {
		if(s.charAt(i)==c) {
			occur = i;
			return occur;
			}
		}
	return occur;
	}
  //returns the first n letters of alphabet, altoether as a String
  //you may assume n is >
public static String firstNAlphabet(int n){
	String topg ="";
    for(int i=0; i < n; i++) {
    	char c = (char) (97+i);
    	topg += c;
    }
    return topg;
  }
  //go until SUCCESSIVE repeats or nothing entered
  public static void goUntilRepeatsOrNothing(){
    //void functions don't return anything (you can use "return;", but don't have to)
	  Scanner kb = new Scanner(System.in);
		String ans = "";
		String ans2 = "";
		ans = kb.nextLine();
		ans2 = kb.nextLine();
		while(ans2.equals(ans)) {
			break;
		}
  }
  public static void main(String[] args) { 
    System.out.println("Press \"Test\" to run JUnit tests");
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for NOTHING, i.e. \"\"");
    goUntilRepeatsOrNothing();
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for REPEATS");
    goUntilRepeatsOrNothing();
    
  }
  

  
}

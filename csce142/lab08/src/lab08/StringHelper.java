package lab08;
import java.util.Scanner;

public class StringHelper {
	/**
	 * This class is the helper method and is where the the methods to replace vowels,
	 * mash strings, and calculate string weight are stored
	 * 
	 * @author Sean Raudat
	 *
	 */
	static Scanner in = new Scanner(System.in);
	static boolean isVowel(char c){
	    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
	    {    
	        return true;
	    }    
	    else
	    {
	        return false;
	    }    
	}
	static String replaceVowelsWith(String s, String r) {
		  s = s.replaceAll("[aeiou]", r);
		   return s;
	}
	public static String mashStrings(String s1,String s2){
		StringBuffer buff = new StringBuffer();
		int max = Math.max(s1.length(), s2.length());
		for(int i = 0; i < max; i++) {
		if(i < s2.length()) {
		buff.append(s2.charAt(i));
		}
		if(i < s1.length()) {
		buff.append(s1.charAt(i));
		}
		}
		return buff.toString();
		}
	public static double weight(String s) {
		double value=0;
		for(int i=0; i<s.length();i++)
		{
		char c = s.charAt(i);
		if(c == 'a'|| c=='e'|| c=='i' ||c== 'o' || c =='u'|| c == 'A'|| c=='E'|| c=='I' ||c== 'O' || c =='U') 
		{
			value=value+2.5;
		}
		else 
		{
			value=value+3.4;
			}
		}
		return value;
		}
	}
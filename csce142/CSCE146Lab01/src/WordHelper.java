/*
 * Written by Sean Raudat for CSCE 146, Lab01
 */
import java.util.*;
import java.io.*;//Used for file input and output
public class WordHelper {
	public static String vowels = "aeiouyAEIOUY";
	
	public static String[] sortByVowels(String[] words)
	// First method, this sorts by vowels in ascending order
	{
		Integer[] numberOfVowels = new Integer[words.length];
		//creates an array to store the number of vowels
		String[] newArray = new String[words.length];
		// the copied array that will be sorted
		for(int i = 0; i < words.length; i++)
		{
			newArray[i] = words[i];
			int wordcount = 0;
			for(int j = 0; j < words[i].length(); j++)
			{
				String temp = Character.toString(words[i].charAt(j));
				if(vowels.contains(temp))
				{
					wordcount++;//increases if vowels in string/word, see lower
				}
			}
			numberOfVowels[i] = wordcount;
		}
		for(int i = 0; i < newArray.length; i++)
		{
			for(int j = 0; j < newArray.length - i - 1; j++)
			{
				if(numberOfVowels[j] > numberOfVowels[j+1])
					//comparison of one to other for sorting if xyz has more vowels then the other
				{
					String temp = newArray[j];
					newArray[j] = newArray[j+1];
					newArray[j+1] = temp;
					//createsa copy of the String array parameter
					Integer tmp = numberOfVowels[j];
					numberOfVowels[j] = numberOfVowels[j+1];
					numberOfVowels[j+1] = tmp;
					}
				}
			}
		return newArray;
		//returns a sorted String array by the number of vowels present
		}
	public static String[] sortByConsonants(String[] words)
	// second method, this sorts by consonatns in ascending order
	{
		Integer[] numberOfConsonants = new Integer[words.length];
		//array for holding consonants(i swear to god i cant type that word one more time)
		String[] newArray = new String[words.length];
		//array that is copied and manipulated
		for(int i = 0; i < words.length; i++)
		{
			newArray[i] = words[i];
			int count = 0;
			for(int j = 0; j < words[i].length(); j++)
			{
				String temp = Character.toString(words[i].charAt(j));
				if(vowels.contains(temp))
				{
					count++;
				}
			}
			numberOfConsonants[i] = words[i].length() - count;
		//gets rid of them vowels so we can just look at consonants
		}
		for(int i = 0; i < newArray.length; i++)
		{
			for(int j = 0; j < newArray.length - i - 1; j++)
			{
				if(numberOfConsonants[j] > numberOfConsonants[j+1])
				{
					String temp = newArray[j];
					newArray[j] = newArray[j+1];
					newArray[j+1] = temp;
					Integer tmp = numberOfConsonants[j];
					numberOfConsonants[j] = numberOfConsonants[j+1];
					numberOfConsonants[j+1] = tmp;
				}
			}
		}
		return newArray;
		//returns a sorted String array by cons0nants 
		}
	public static String[] sortByLength(String[] words)
	// Last method, this sorts by length of word in ascending order
	{
		Integer[] length = new Integer[words.length];
		//array for amount of letters in a word aka length
		String[] newArray = new String[words.length];
		//array we have copied and will be f**king with
		for(int i = 0; i < words.length; i++)
		{
			newArray[i] = words[i];
			length[i] = words[i].length();
		}
		for(int i = 0; i < newArray.length; i++)
		{
			for(int j = 0; j < newArray.length - i - 1; j++)
			{
				if(length[j] > length[j+1])
					//comparison one to the other
				{
					String temp = newArray[j];
					newArray[j] = newArray[j+1];
					newArray[j+1] = temp;
					Integer tmp = length[j];
					length[j] = length[j+1];
					length[j+1] = tmp;
					}
				}
			}
		return newArray;
		//returns a sorted String array by length
		}
	}

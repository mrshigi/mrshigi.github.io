/*
 * Sean Raudat for CSCE 146, Lab02
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileIOSolutions{
	public static void pastTense(String file1, String file2) 
	{
		try {
			//Read file using scanner
			Scanner sr=new Scanner(new File(file1));//As with all my assignments my scanner will always be sr for sean raudat, im pavlovian training you
			sr.useDelimiter("\\s");
			FileWriter writer=new FileWriter(new File(file2));
			while(sr.hasNext()) 
			{
				String word=sr.next().replaceAll("[^a-zA-Z0-9]", ""); //Ignore special characters
				if(word.equalsIgnoreCase("is")) //change is to was 
					word="was";
				writer.write(word);
				writer.write("\n");
				System.out.println(word);
			}
			sr.close();
			writer.close();
			}
		catch (FileNotFoundException e) //self explanatory but if the file is not there it throws this exception 
		{
			System.out.println("The file cannot be found.");
		} 
		catch (IOException e) //self explanatory but if the file is there but there is some other error we throw this bad boy in
		{
			System.out.println("Some error occurred while writing the file.");
		}
		
	}
	public static double totalTubeVolume(String file) 
	{
		double totalVolume=0;
		try {
			Scanner sr=new Scanner(new File(file));
			while(sr.hasNext()) 
			{
				String wordArr[]=sr.nextLine().split("\t");
				double radius=Double.valueOf(wordArr[1]);
				double height=Double.valueOf(wordArr[2]);
				totalVolume+=(Math.PI*radius*radius*height);//Volume of a calculation
			}
			sr.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("The given file cannot be found.");
		} 
		return totalVolume;
	}
}
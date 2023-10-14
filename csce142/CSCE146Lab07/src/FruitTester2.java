/*
 *Sean Raudat for CSCE 146, Lab07
 *I made a non generic one before this tester
 *You can use this if you want or the other
 */
import java.util.*;
import java.io.*;
public class FruitTester2 
{
	public static void main(String[] args) throws IOException 
	{
		LinkedBST tree = new LinkedBST();
		System.out.println("Welcome to the Fruit Tree\nEnter in the name of the file");
		Scanner sr = new Scanner(System.in);
		String fileName = sr.nextLine();
		Scanner fileScanner;
		String line;
		String[] splitLine;
		if (fileName == null) 
		{
			return;
		}
		try 
		{
			fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine()) 
			{
				line = fileScanner.nextLine();//reads in each line in 
				splitLine = line.split("\t");//splits file line by tab delimiter
				String name = splitLine[0];//before delimiter is a string
				Double data = Double.parseDouble(splitLine[1]);
				tree.insert(name, data);
			}
			System.out.println("Populating the tree");
			System.out.println("Printing the in-order traversal");
			tree.printInOrder();
			System.out.println("\n\nPrinting the pre-order traversal");
			tree.printPreOrder();
			System.out.println("\n\nPrinting the post-order traversal");
			tree.printPostOrder();
			System.out.println("\n\nDeleting Apple 0.4859853412170728");
			tree.delete("apple", 0.4859853412170728);
			tree.printInOrder();
			} 
		catch (IOException e) 
		{
			System.out.println(e);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return;
		}
	}

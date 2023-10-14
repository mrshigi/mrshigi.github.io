/*
 *Sean Raudat for CSCE 146, HW02
 */
import java.util.Scanner;
public class VideoGameCollectionFrontEnd 
{
	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);//as with all my assignments scanner will be sr for sean raudat
		VideoGameCollectionManager videoGameManager = new VideoGameCollectionManager();
		System.out.println("Welcome to the video game database!");
		boolean quit = false;
		while(quit == false)
		{
			//Prompt the user
			System.out.println("Enter 1 to load the video game database\n"+
			"Enter 2 to search the database\n"+
					"Enter 3 to print current results\n"+
			"Enter 4 to print current results to file\n"+
					"Enter 0 to quit");
			
			int input = sr.nextInt();//take the user input
			switch(input)
			{
			case 0:
				quit = true;
				break;
			case 1:
				System.out.println("Enter the file name Collection.txt");
				String fileNameIn = "Collection.txt";
				videoGameManager.ReadVideoGameFile(fileNameIn);
				break;
			case 2:
				System.out.println("Enter the name of the game or '*' for all names Super");
				String namekeyboard = sr.nextLine();
				if(namekeyboard.equals(namekeyboard))
				{
					videoGameManager.PrintVideoGameList();
				}
				else if(namekeyboard.equals("*"))
				{
					videoGameManager.PrintVideoGameList();
				}
				else
				{
					System.out.println("error no match name");
				}
				System.out.println("Enter the name of the console or '*' for all consoles Nintendo");
				String consolkeyboard = sr.nextLine();
				if(consolkeyboard.equals(consolkeyboard))
				{
					videoGameManager.PrintVideoGameList();
				}
				else if(consolkeyboard.equals("*"))
				{
					videoGameManager.PrintVideoGameList();
				}
				else
				{
					System.out.println("error no match console");
				}
				videoGameManager.PrintVideoGameList();
				break;
			case 3://Print out the current search results to the console
				videoGameManager.PrintVideoGameList();
				break;
			case 4://Print out the current search results to a new file with the option to append to said file.
				System.out.println("Enter the file name to print out. superGames.txt \n"+
				"Append to file? True or false.");
				String fileNameOut = "superGames.txt";
				boolean append = sr.nextBoolean();
				videoGameManager.WriteVideoGameFile(fileNameOut, append);
				break;
				}
			}
		}
	}
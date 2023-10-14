/*
 *Sean Raudat for CSCE 146, HW02
 */
import java.util.*;
import java.io.*;
public class VideoGameCollectionManager
{
	private GenericLinkedList<VideoGame> videoGames; //used to store the vidya games
	public static final String FILE_NAME = "/Users/diemdao/Desktop/grades.txt";
	private static final String DELIM = "\t";//the file we are given is tab delimited
	public VideoGameCollectionManager()//Constructor
	{
		videoGames = new GenericLinkedList<VideoGame>();
	}
	public void ReadVideoGameFile(String fileName)
	{
		videoGames = new GenericLinkedList<VideoGame>();
		try
		{
			Scanner srfile = new Scanner(new File(fileName));//scanner again with sr for sean raudat, again im pavlobvian training you
			while(srfile.hasNextLine())
			{
				String nextLine = srfile.nextLine();
				//line is split using the delimiter as the text file uses tabs
				String[] splitStrings = nextLine.split(DELIM);
				/*If the newly created array is not 2 items in length then 
				 * that line is not correctly formated and should be ignored as the assignemnt states
				 * "The program should ignore items that do not strictly follow the previously stated format."
				 */
				if(splitStrings.length != 2)
					continue;
				String name = splitStrings[0];
				String console = splitStrings[1];
				VideoGame newVideoGame = new VideoGame(name,console);
				videoGames.insert(newVideoGame);
			}
			srfile.close();//dont want resource/memory leaks so close that mf file
		}
		catch(Exception e)
		{
			System.out.println("Oh no error exception");
		}
	}
	public void WriteVideoGameFile(String fileName, boolean append)
	{
		if(videoGames == null)
			return;
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName,append));
			while(videoGames.hasMore())
			{
				VideoGame aVideoGame = videoGames.getCurrent();
				fileWriter.println(aVideoGame.getName()+DELIM+aVideoGame.getConsole());
				videoGames.gotoNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	public void PrintVideoGameList()//This method prints everything in the list
	{
		videoGames.resetCurrent();
		while(videoGames.hasMore())
		{
			VideoGame aVideoGame = videoGames.getCurrent();
			System.out.println(aVideoGame.getName()+DELIM+aVideoGame.getConsole());
			videoGames.gotoNext();
		}
	}
	public void addNewVideoGame(VideoGame newVideoGame)//Adds a new video game to the list
	{
		videoGames.insert(newVideoGame);
	}
	public void removeVideoGame(VideoGame removeVideoGame)//removes the video game from the list
	{
		videoGames.resetCurrent();
		while(!videoGames.getCurrent().equals(removeVideoGame))
		{
			videoGames.gotoNext();
		}
		videoGames.deleteCurrent();
	}
}
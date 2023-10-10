
public class VideoGame
{
	private String name;
	private String console;
	public VideoGame()//default constructor
	{
		this.name = "No name yet";
		this.console = "No console yet";
	}
	public VideoGame(String aName, String aConsole)
	{
		this.setName(aName);
		this.setConsole(aConsole);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getConsole()
	{
		return console;
	}
	public void setConsole(String console)
	{
		this.console = console;
	}
	public String toString()
	{
		return "Name: " +this.name+ " Console: "+this.console;
	}
	public boolean equals(VideoGame aVideoGame)
	{
		return aVideoGame != null && this.name.equals(aVideoGame.getName()) && this.console.equals(aVideoGame.getConsole());
	}
}
/*
 *Sean Raudat for CSCE 146, Lab05
 */
public class Process 
{
	private String name;
	private double completionTime;
	public Process()
	{
		name = "none";
		completionTime = 0;
	}
	public Process(String name, double time)
	{
		this.name = name;
		if(time >= 0)
			this.completionTime = time; //this is self explanatory
		else
			this.completionTime = 0;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getCompletionTime() 
	{
		return completionTime;
	}
	public void setCompletionTime(double completionTime) 
	{
		if(completionTime >= 0)
			this.completionTime = completionTime;
		else
			this.completionTime = 0;
	}
	public String toString()
	{
		return "Process Name: " + name + " Completion Time: " + completionTime ;
	}
}
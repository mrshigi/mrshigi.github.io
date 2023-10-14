/*
 *Sean Raudat for CSCE 146, HW01
 *This class is just to set values and act as a constructor? class
 *All the code is pretty self explanatory therefore im not gonna comment on it
 */
public class Prize {
	private String name;
	private double prize;
	public Prize() 
	{
	}
	public Prize(String name, double prize) 
	{
		this.name = name;
		this.prize = prize;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPrize() 
	{
		return prize;
	}
	public void setPrize(double prize) 
	{
		this.prize = prize;
	}
}

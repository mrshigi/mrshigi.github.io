/*
 *Sean Raudat for CSCE 146, Lab03
 *I am gonna take an L on this lab it feels, i could not get my scanner to open properly again on the tester and so i get 
 *a file not found every time i try to test my code and it is mega frustrating
 *I do not know if my code is working as every time i try to store the Grocery list in the directory it somehow fries my code.
 *I will hope and assume it will work for you all as the gtrocery list will be actually working for your testing but idk fam
 *Line 71 of the tester also throws an error every time
 *I am gonna make a bold assumption i am going to have to redo this lab for the redo assignment
 */
public class GroceryItem
{
	String name;
	double value;
	GroceryItem(String n, double v)
	{
		name=n;
		value=v;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setValue(double n)
	{
		if(n>0)
			value=n;
		else value=0;
	}
	String getName()
	{
		return name;
	}
	double getValue()
	{
		return value;
	}
	public String toString()
	{
		return "Name: "+name+", Price: "+value;
	}
	boolean equals(GroceryItem m)
	{
		if(this.name.equals(m.name) && this.value==m.value) 
			return true;
		else
			return false;
	}
}

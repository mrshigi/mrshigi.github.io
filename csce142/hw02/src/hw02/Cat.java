package hw02;
//Sean Raudat for CSCE 145 HW02
class Cat extends Animal {
	protected String mood;
	private String[] moods = {"Sleepy","Playful","Hungry"};
	public Cat()
	{}
	public Cat(String name, double weight, String mood)
	{
		super(name,weight);
		boolean flag = true;
		for(String item : moods)
		{
			if(item.equals(mood))
			{
				this.mood = mood;
				flag = false;
				break;
				}
			}
		if(flag){
			System.out.println("Enter a valid mood please");
			System.exit(0);
			}
		}
	public String getMood()
	{
		return this.mood;
		}
	public void setMood(String mood)
	{
		boolean flag = true;
		for(String item : moods)
		{
			if(item.equals(mood)){
				this.mood = mood;
				flag = false;
				break;
				}
			}
		if(flag){
			System.out.println("Enter a valid mood please");
			System.exit(0);
			}
		}
	public boolean equals(Cat c)
	{
		if(super.equals(c) && c.getMood().equals(this.mood))
			return true;
		return false;
	}
	public String toString()
	{
		return super.toString() + "Mood: " + getMood();
		}
	}

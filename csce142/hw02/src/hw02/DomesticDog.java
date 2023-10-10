package hw02;
//Sean Raudat for CSCE 145 HW02
class DomesticDog extends Dog{
	protected String type;
	private String[] types = {"Retriever","Terrier", "Husky","Yappy","Mutt"};
	public DomesticDog(){};
	public DomesticDog(String name, double weight, int energyLevel, String type){
		super(name,weight,energyLevel);
		boolean flag = true;
		for(String item : types){
			if(item.equals(type)) {
				this.type = type;
				flag = false;
				break;}
			}
		if(flag){
			System.out.println("Enter a valid type please");
			System.exit(0);}
		}
	public String getType()
	{
		return this.type;
		}
	public void setType(String type)
	{
		boolean flag = true;
		for(String item : types)
		{
			if(item.equals(type))
			{
				this.type = type;
				flag = false;
				break;
				}
			}
		if(flag)
		{
			System.out.println("Enter a valid type please");
			System.exit(0);
			}
		}
	public boolean equals(DomesticDog d){
		if(super.equals(d) && d.getType().equals(type))
			return true;
		return false;
		}
	public String toString(){
		return super.toString() + " Type of Dog: " + type;
		}
	}
	
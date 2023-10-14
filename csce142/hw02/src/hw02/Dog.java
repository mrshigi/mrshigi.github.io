package hw02;
//Sean Raudat for CSCE 145 HW02
public class Dog extends Animal {
	protected int energyLevel;
	public Dog(){};
	public Dog(String name, double weight, int energyLevel){
		super(name,weight);
		if(energyLevel > 100 && energyLevel < 0){
			System.out.println("The enery level of a dog should be within 0 and 100");
			System.exit(0);
			}
		this.energyLevel = energyLevel;
		}
	public int getEnergyLevel(){
		return this.energyLevel;
		}
	public void setEnergyLevel( int energyLevel){
		if(energyLevel > 100 && energyLevel < 0)
		{
			System.out.println("The enery level of a dog should be within 0 and 100");
			System.exit(0);
			}
		this.energyLevel = energyLevel;
		}
	public boolean equals(Dog d){
		if(super.equals(d) && d.getEnergyLevel() == this.energyLevel)
			return true;
		return false;
		}
	public String toString(){
		return super.toString() + " Enery Level: "+this.energyLevel;
		}
	}
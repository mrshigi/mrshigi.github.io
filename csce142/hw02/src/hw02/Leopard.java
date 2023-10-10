package hw02;
//Sean Raudat for CSCE 145 HW02
class Leopard extends Cat {
	protected int numberOfSpots;
	public Leopard(){};
	public Leopard(String name, double weight, String mood, int numberOfSpots){
		super(name,weight,mood);
		this.numberOfSpots = numberOfSpots;
		}
	public int getNumberOfSpots(){
		return this.numberOfSpots;
		}
	public void setNumberOfSpots(int numberOfSpots){
		this.numberOfSpots = numberOfSpots;
		}
	public boolean equals(Leopard l){
		if(super.equals(l) && l.getNumberOfSpots() == this.numberOfSpots)
		{
			return true;
			}
		return false;
		}
	public String toString(){
		return super.toString() +"Number of Spots: " + this.numberOfSpots;
		}
	}
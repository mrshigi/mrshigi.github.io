package hw02;
//Sean Raudat for CSCE 145 HW02
class Wolf extends Dog {
	protected String packLeaderName;
	public Wolf(){};
	public Wolf(String name, double weight, int energyLevel, String packLeaderName)
	{
		super(name,weight,energyLevel);
		this.packLeaderName= packLeaderName;
		}
	public void setPackLeaderName(String packLeaderName){
		this.packLeaderName = packLeaderName;
		}
	public String getPackLeaderName(){
		return packLeaderName;}
	public boolean equals(Wolf w){
		if(super.equals(w) && w.getPackLeaderName().equals(packLeaderName))
			return true;
		return false;
	}
	public String toString()
	{
		return super.toString() + " Pack Leader Name: " + packLeaderName;
		}
	}
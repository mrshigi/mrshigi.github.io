package hw02;
//Sean Raudat for CSCE 145 HW02
class Animal {
	protected String name;
	protected double weight;
	public Animal(){}
	public Animal(String name,double weight){
		this.name = name;
		if(weight < 0 ){
			System.out.println("The weight should be greater than 0");
			System.exit(0);
			}
		this.weight = weight;
		}
	public void setName(String name){
		this.name = name;
		}
	public void setWeight(double weight){
		if(weight < 0 ){
			System.out.println("The weight should be greater than 0");
			System.exit(0);
			}
		this.weight = weight;
		}
	public String getName(){
		return this.name;
		}
	public double getWeight(){
		return this.weight;
		}
	public String toString(){
		return "Name: " + this.name +" Weight: " + this.weight ;
		}
	public boolean equals(Animal a){
		if(a.getName().equals(this.name) && a.getWeight() == this.weight)
			return true;
		return false;
		}
	}

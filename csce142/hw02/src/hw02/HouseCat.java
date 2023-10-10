package hw02;
//Sean Raudat for CSCE 145 HW02
class HouseCat extends Cat {
	private String[] types = {"Short Hair", "Bombay", "Ragdoll", "Sphinx", "Scottish Fold"};
	protected String type;
	public HouseCat(){};
	public HouseCat(String name, double weight, String mood, String type){
		super(name,weight,mood);
		boolean flag = true;
		for(String item : types){
			if(item.equals(type)){
				this.type = type;
				flag = false;
				break;
				}
			}
		if(flag){
			System.out.println("Enter a valid type please");
			System.exit(0);
			}
		}
	public String getType(){
		return type;
		}
	public void setType(String type){
		boolean flag = true;
		for(String item : types){
			if(item.equals(type))
			{
				this.type = type;
				flag = false;
				break;
				}
			}
		if(flag){
			System.out.println("Enter a valid type please");
			System.exit(0);
			}
		}
	public boolean equals(HouseCat c){
		if(super.equals(c) && c.getType().equals(this.type))
			return true;
					return false;
					}
	public String toString(){
		return super.toString() + "Type: " + getType();
		}
	}
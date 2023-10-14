package hw02;
//Sean Raudat for CSCE 145 HW02
class AnimalCollection {
	Animal[] animals;
	public AnimalCollection(){
		animals = new Animal[0];
		}
	public void addAnimal(Animal a){
		Animal[] arr=new Animal[animals.length+1];
		for(int i =0; i < animals.length;i++)
			arr[i] = animals[i];
		arr[animals.length] = a;
		animals = arr;
		}
	public void removeAnimal(String animal){
		int j=0;
		boolean flag = false;
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i].getName().equals(animal))
			{
				j = i;
				flag = true;
				break;
				}
			}
		if(flag){
			Animal[] arr = new Animal[animals.length-1];
			int k = 0;
			for(int i = 0 ; i < animals.length; i++){
				if(i == j)
					continue;
				arr[j] = animals[i];
				j++;
				}
			}else
			System.out.println("The Animal not found");
	}
	public void printAnimals(){
		for(Animal item : animals){
			System.out.println(item.toString());
			}
		}
	}

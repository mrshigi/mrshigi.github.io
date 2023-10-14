package hw02;
//Sean Raudat for CSCE 145 HW02
import java.util.Scanner;
class AnimalFrontEnd{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AnimalCollection collection = new AnimalCollection();
		String name, mood,type;
		int energy,dots;
		double weight;
		while(true){
			System.out.println("Welcome to th Cat and Dog Collection!");
			System.out.println("Would you like to");
			System.out.println("1. Add a cat or a dog");
			System.out.println("2. Remove a cat or dog");
			System.out.println("3. Quit");
			System.out.println("Enter Selection");
			int choice = in.nextInt();
			switch(choice){
			case 1: 
				System.out.println("Would you like to add a 4.House Cat, 5. A Leopard, 6. A Domestic Dog, or 7. A Wolf");
				int choice2 = in.nextInt();
				switch(choice2){
				case 4: 
					System.out.println("Enter the house cat's name, weight, mood, and type");
					name = in.next();
					weight = in.nextDouble();
					mood = in.next();
					type = in.next();
					HouseCat c = new HouseCat(name,weight,mood,type);collection.addAnimal(c);
					collection.printAnimals();
					break;
				case 5: 
					System.out.println("Enter the leopard's name, weight, mood, and number of spots");
					name = in.next();
					weight = in.nextDouble();
					mood = in.next();
					dots = in.nextInt();
					Leopard l = new Leopard(name,weight,mood,dots);
					collection.addAnimal(l);
					collection.printAnimals();
					break;
				case 6: 
					System.out.println("Enter the domestic dog's name, weight, energy level, and type");
					name = in.next();
					weight = in.nextDouble();
					energy = in.nextInt();
					type = in.next();
					DomesticDog d = new DomesticDog(name,weight,energy,type);
					collection.addAnimal(d);
					collection.printAnimals();
					break;
				case 7: 
						System.out.println("Enter the wolf's name, weight, energy level, and type");
						name = in.next();
						weight = in.nextDouble();
						energy = in.nextInt();
						type = in.next();
						Wolf w = new Wolf(name,weight,energy,type);
					collection.addAnimal(w);
					collection.printAnimals();
					break;
					}
				break;
				case 2: 
					System.out.println("Enter the animal's name that is to be removed");
					name = in.next();
					collection.removeAnimal(name);
					collection.printAnimals();
					break;
				case 3:
					System.out.println("Bye!");
					System.exit(0);
					}
			}
		}
	}
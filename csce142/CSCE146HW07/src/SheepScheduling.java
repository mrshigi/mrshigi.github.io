/*
 *Sean Raudat for CSCE 146, HW07 SHEEEEEEEEEEEEEP
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class SheepScheduling 
{
	public static void main(String[] args) throws FileNotFoundException //because we are using a file to import the data gotta have a throws file not found type beat, easier to do it here then a try catch down below
	{
                Scanner sr = new Scanner(System.in);//scanner is sr as per usual
                while (true) 
                {
                        System.out.print("Enter the file name: ");
                        String name = sr.nextLine();
                        Scanner file = new Scanner(new File(name));
                        List<Sheep> sheeps = new LinkedList<>();
                        MinHeap<Sheep> waitingSheeps = new MinHeap<>();
                        while (file.hasNextLine()) //as long as the imported file has a next line it splits and parses the wait times and sheer times
                        {
                                String line = file.nextLine();
                                String[] sheep = line.split("\\s+");
                                sheeps.add(new Sheep(sheep[0], Integer.parseInt(sheep[1]), Integer.parseInt(sheep[2])));
                        }

                        sheeps.sort(Comparator.comparing(Sheep::getArrivalTime));
                        String output = "";
                        int arrivalTime = 0;
                        System.out.println("Schedule from the Sheepy File:");
                        while (!sheeps.isEmpty()) 
                        {
                                Sheep tempsheep = sheeps.remove(0);
                                arrivalTime += tempsheep.getShearingTime();
                                while (!sheeps.isEmpty()) 
                                {
                                        if (sheeps.get(0).getArrivalTime() <= arrivalTime)
                                                waitingSheeps.insert(sheeps.remove(0));
                                        else
                                                break;
                                }
                                System.out.println(tempsheep);
                                while (!waitingSheeps.isEmpty()) // as long as the queue/process is not null run this loop
                                {
                                        Sheep k = waitingSheeps.remove();
                                        arrivalTime += k.getShearingTime();
                                        System.out.println(k);
                                        while (!sheeps.isEmpty()) 
                                        {
                                                if (sheeps.get(0).getArrivalTime() <= arrivalTime)
                                                        waitingSheeps.insert(sheeps.remove(0));
                                                else
                                                        break;
                                        }
                                }
                        }
                        System.out.println("Do you want to run again?(y/n): ");
                        String choice = sr.nextLine();
                        if (choice.equalsIgnoreCase("n")) 
                        {
                                break;
                        }
                }
        }
}
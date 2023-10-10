/*
 *Sean Raudat for CSCE 146, HW01
 *A pet crow in the prize list is fuckin 10/10, they are known to bring shiny objects and therefore is priceless
 *I also recommend watching the crow milk/fight milk episode of Its Always Sunny in Philadelphia for more crow Lore
 */
import java.util.Scanner;
public class ShowcaseGame 
{
	public static void main(String[] args) 
	{
       Scanner sr = new Scanner(System.in);// as in my last assignment i do sr for sean raudat
       Showcase showcase = new Showcase();
       while (true) 
       {
           System.out.println("Welcome to the SHOWCASE SHOWDOWN(TOTALLY NOT THE PRICE IS RIGHT)! \nYour 5 prizes are: ");
           System.out.println("---------------------------------------------------------");
           Prize[] randomPrizes = showcase.select5RandomPrizes();
           double sumPrizeValue=0;
           for (int i = 0; i < randomPrizes.length; i++) 
        	   //for loop to sum the prize values
           {
               System.out.println(randomPrizes[i].getName());
               sumPrizeValue =sumPrizeValue+ randomPrizes[i].getPrize();
           }
           System.out.println("\n \nYou must guess the total cost of all without going over\nEnter your guess ");
           int input = sr.nextInt();
           if ( Math.abs(sumPrizeValue-input)<=1300) 
        	   //what an odd number, 1300 is just not tickling me right, 1500 feels better
           {
               System.out.println("You guessed " + input + " the actual price is "+ sumPrizeValue);
               System.out.println("Your guess was under! You win! ");
           } 
           else 
           {
               System.out.println("You guessed " + input + " the actual price is "+ sumPrizeValue);
               System.out.println("I'm sorry but that guess was mid. You lose beacsue you cant randomly generate perfectection like I can.");
           }
           System.out.println("Would you like to play again? Enter '666' to quit");
           //I like to meme the whole satan thing and you cant take points off for i pray/ I feel like it gives a personalization towards my code
           String playagain = sr.next();
           if (playagain.equals("666")) 
           {
               System.out.println("Bye!");
               break;
           }
       }
   }

}
/*
 *Sean Raudat for CSCE 146, HW01
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
public class Showcase 
{
    private Prize prizes[];
    public Showcase() 
    {
        prizes = new Prize[50];
        readDataFromFile();
    }
    public Prize[] select5RandomPrizes() 
    {
    	int i;
        Prize randomPrizes[] = new Prize[5];//array with 5 prizes as asked for my queen
        Random rand = new Random();
        for (int j = 0; j < 5; j++) 
        {
        	Prize randomPrize;
            while (true) 
            {
                i = rand.nextInt(50) % 50;
                randomPrize = prizes[i];
                boolean exists = false;
                for (int k = 0; k < randomPrizes.length; k++) 
                {
                	Prize prize = randomPrizes[k];
                	if (prize != null) 
                	{
                		if (randomPrize.getName().equalsIgnoreCase(prize.getName()))//fetch them names cuh
                		{
                            exists = true;
                        }
                    }
                }
                if (!exists) //If the prize doesnt exits it breaks imagine
                {
                    break;
                }
            }
            randomPrizes[j] = randomPrize;
        }
        return randomPrizes;
    }
    public void readDataFromFile() 
    {
        BufferedReader br = null;
        int total = 0;
        try {
            String CurrentLine;
            br = new BufferedReader(new FileReader("PrizeList.txt"));
            /*I cannot for the life of me get the prizelist to 
             * properly open with the BR in eclipse and i cant really tell 
             * if my frontend code is working because it keeps throwing a file not found exception
             * prayer hands it works for you (Yuqi Song W)
             */
            while ((CurrentLine = br.readLine()) != null) 
            {
                if (!CurrentLine.trim().equals("")) 
                {
                    String input[] = CurrentLine.split("\\s+");
                    String prizeName = input[0] + " ";
                    for (int j = 1; j < input.length - 1; j++) 
                    {
                        prizeName = prizeName + input[j] + " ";
                    }
                    double prizeValue = Double.parseDouble(input[input.length - 1]);
                    prizes[total++] = new Prize(prizeName, prizeValue);
                    if (total == 50) 
                    {
                        break;
                    }
                }
            }

        } 
        catch (IOException e)
        {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
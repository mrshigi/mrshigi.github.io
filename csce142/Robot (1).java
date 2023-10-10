/*
 *Sean Raudat for CSCE 146, HW04 QQQQQQQQQQQ
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Robot 
{
	public static void main(String [] args)
	{
		Scanner sr=new Scanner(System.in);//As with all my assingments my scanner is sr for my name
		Queue<String> queue=new Queue<String>();
		while(true)
		{
			System.out.println("Welcome to the Robot Simulator");
			System.out.println("Enter file for the Board");
			String filename1=sr.next();// board file name
			System.out.println("Enter file for the Robot Commands");
			String filename2=sr.next();// robot Commands file name
			// 10X10 board
			char [][] board=new char[10][10];//10x10 baord
			BufferedReader br1 = null;
			BufferedReader br2 = null;
			//read in the board file
			try 
			{
				br1 = new BufferedReader(new FileReader(filename1));
				String line = "";
				int j = 0;
				while((line = br1.readLine())!=null)
				{
					// fill each character in board
					for(int i = 0;i<line.length();i++)
					{
						board[j][i] = line.charAt(i);
					}
					// increase line number
					j++;
				}
				br1.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			// read robot command
			try 
			{
				br2 = new BufferedReader(new FileReader(filename2));
				String line= "";
				while((line = br2.readLine()) != null)
				{
					String [] splt=line.split(" ");
					// add move name in queue
					queue.enqueue(splt[1]);
				}
				br2.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			int command = 0;
			int x = 0, y = 0;
			boolean b = false;// true for crash
			while(queue.isEmpty()==false)
			{
				board[x][y] = 'O';
				// print board
				for(int i = 0;i < 10;i++)
				{
					for(int j = 0;j<10;j++)
					{
						System.out.print(board[i][j]);
					}
					System.out.print("\n");
				}
				board[x][y]='_';	// reset position
				// dequeue move from queue
				String string = queue.denqueue();
				// for next x and y position using move
				if(string.toUpperCase().equals("RIGHT")==true){y++;}
				if(string.toUpperCase().equals("LEFT")==true){y--;}
				if(string.toUpperCase().equals("UP")==true){x--;}
				if(string.toUpperCase().equals("DOWN")==true){x++;}
				if(command==0)
				{
					System.out.println("Simulation begin");
				}
				// display command
				System.out.println("Command "+ command);
				// for crash of robot
				if(x < 0 || x > 10 || y < 0 || y > 10 || board[x][y] == 'X')
				{
					System.out.println("CRASH! ");
					b = false;
					break;
				}
				else
				{
					b = true;
					command++;
				}
			}
			// for last print of board
			if(b==true)
			{
				board[x][y]='O';
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						System.out.print(board[i][j]);
					}
					System.out.print("\n");
				}
			}
			System.out.println("Simulation end");
			System.out.println("Quit? Enter \"true\" to quit or hit enter to run another simulation");
			// next board and robot
			String tf = sr.next();
			// true for quit
			if(tf.toUpperCase().equals("TRUE")==true)
			{
				break;
			}
			// otherwise continue
			queue.clear();
		}
		sr.close();
	}
}
/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) throws IOException
    {
    ShapeTree T = new ShapeTree();
    Scanner sr = new Scanner(System.in);
    boolean quit = false;
    while(quit == false)
	{
		//Prompt the user
    	 System.out.println("Welcome to the Shape Tree!\r\n"
         		+ "Enter 1. To Read a Shape Tree from a File.\r\n"
         		+ "Enter 2. To Print a Tree Traversal to the Console\r\n"
         		+ "Enter 3. To Add a Shape.\r\n"
         		+ "Enter 4. To Remove a Shape.\r\n"
         		+ "Enter 5. To Search for a Shape.\r\n"
         		+ "Enter 6. To Find the Shape with the Max Area.\r\n"
         		+ "Enter 7. To Remove All Shapes Greater than an Area.\r\n"
         		+ "Enter 8. To Print Shape Tree to File.\r\n"
         		+ "Enter 0. To Quit.");
		int input = sr.nextInt();//take the user input
		switch(input)
		{
		case 0:
			quit = true;
			System.out.println("Goodbye!");
			break;
		case 1:
			BufferedReader ssr = null;//Use ssr for sean raudat as per usual and the BufferedReader to read the file
		    ssr = new BufferedReader(new FileReader("shapes.txt"));
		    String line;
		    //Start the loop to read the file
		    while ((line = ssr.readLine()) != null)
		    {
		            int valid = 0;
		            //Split the line by tab.
		            String words[] = line.split("\t");
		            if(words[0].equals("Rectangle"))
		            {
		                  valid = 1;
		                  try
		                  {
		                        T.insert(new Rectangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
		                  }
		                  catch(Exception e)
		                  {
		                        System.out.println("Not properly formatted line. "
		                                    + "Yes you should check for these. Not intentionally "
		                                    + "causing a problem");
		                  }
		            }
		           
		            else if(words[0].equals("Right Triangle"))
		            {
		                  valid = 1;
		                  try
		                  {
		                        T.insert(new Triangle(Double.parseDouble(words[1]),Double.parseDouble(words[2])));
		                  }
		                  catch(Exception e)
		                  {
		                        System.out.println("Not properly formatted line. "
		                                    + "Yes you should check for these. Not intentionally"
		                                    + " causing a problem");
		                  }
		            }
		           
		            else if(words[0].equals("Circle"))
		            {
		                  valid = 1;
		                  try
		                  {
		                        T.insert(new circle(Double.parseDouble(words[1])));
		                  }
		                  catch(Exception e)
		                  {
		                        System.out.println("Not properly formatted line. "
		                                    + "Yes you should check for these. Not intentionally "
		                                    + "causing a problem");
		                  }
		            }
		            else
		            {
		                  System.out.println("Not properly formatted line. "
		                              + "Yes you should check for these. Not intentionally "
		                              + "causing a problem");
		            }
		            if(valid == 1)
		            {
		                  for(String word:words)
		                  {
		                        System.out.print(word+"\t");
		                  }
		                  System.out.println();
		            }
		    }
		    ssr.close();
		    System.out.println();
			break;
		case 2:
			System.out.println("Which Traversal"
					+ "Enter 1. For Pre-order.\r\n"
					+ "Enter 2. For In-order\r\n"
					+ "Enter 3. For Post-order");
			int input1 = sr.nextInt();
			switch(input1) 
			{
			case 1:
				 T.preorder();
			        System.out.println();
			        break;
			case 2: 
				  T.inorder();
			        System.out.println();
			        break;
			case 3:
			     T.postorder();
			        System.out.println();
			        break;
			}
		case 3:
			System.out.print("Enter shape type to add (Circle, Rectangle, Triangle)\r\n");
	        String shapeType = sr.next();
			Shape shape;
		        switch (shapeType) 
		        {
		            case "Circle":
		            	System.out.println("Enter the radius");
						Double rad = sr.nextDouble();
		                shape = new circle(rad);
		                sr.nextLine();
		                break;
		            case "Rectangle":
		            	System.out.println("Enter the first side");
		            	Double s1 = sr.nextDouble();
		            	System.out.println("Enter the second side");
						Double s2 = sr.nextDouble();
						Double triarea = s1*s2*.5;
		                shape = new Rectangle(s1, s2);
		                break;
		            case "Triangle":
		            	System.out.println("Enter the first side");
						Double s3 = sr.nextDouble();
						System.out.println("Enter the second side");
						Double s4 = sr.nextDouble();
		            	shape = new Triangle(s3, s4);
		                sr.nextLine();
		                break;
		            default:
		                System.out.println("Invalid shape type.");
		                continue;
		        }
		        shape.getArea();
		        T.addShape(shape);
		        System.out.println("Shape added.");
			break;
		case 4:
			System.out.println("Enter the type of shape to remove\r\n"
					+ "Triangle\r\n"
					+ "circle\r\n"
					+ "Rectangle\r\n");
			 String shapeType1 = sr.next();
				switch (shapeType1) 
		        {
		        case "Circle":
		        	System.out.println("Enter the radius");
					Double rad = sr.nextDouble();
					T.delete(shapeType1, rad);
					break;
		        case "Rectangle":
		        	System.out.println("Enter the first side");
					Double s1 = sr.nextDouble();
					System.out.println("Enter the second side");
					Double s2 = sr.nextDouble();
					Double rectarea = s1*s2;
					T.delete(shapeType1, rectarea);	
					break;
		        case "Triangle":
	            	System.out.println("Enter the first side");
					Double s3 = sr.nextDouble();
					System.out.println("Enter the second side");
					Double s4 = sr.nextDouble();
					Double triarea = s3*s4*.5;
					T.delete(shapeType1, triarea);
					break;
		        default:
	                System.out.println("Invalid shape type.");
	                continue;
		        }
				break;
		case 5:
			System.out.println("Enter the type of shape to Search"
					+ "Triangle\r\n"
					+ "circle\r\n"
					+ "Rectangle\r\n");
			 String shapesearch = sr.next();
				switch (shapesearch) 
		        {
		        case "Circle":
		        	System.out.println("Enter the radius");
					Double rad = sr.nextDouble();
					T.search(shapesearch, rad);
					System.out.println();
					break;
		        case "Rectangle":
		        	System.out.println("Enter the first side");
					Double s1 = sr.nextDouble();
					System.out.println("Enter the second side");
					Double s2 = sr.nextDouble();
					Double rectarea = s1*s2;
					T.search(shapesearch, rectarea);
					System.out.println();	
					break;
		        case "Triangle":
		        	System.out.println("Enter the first side");
					Double s5 = sr.nextDouble();
					System.out.println("Enter the second side");
					Double s6 = sr.nextDouble();
					Double triarea = s5*s6*.5;
					T.search(shapesearch, triarea);
					System.out.println();	
					break;
		        default:
	                System.out.println("Invalid shape type.");
	                continue;
		        }
			break;
		case 6:
			 System.out.println("The shape with the max area is: "+T.maxArea());
			break;
		case 7:
			System.out.println("Enter the maximum area");
			Double area1 = sr.nextDouble();
			T.deleteGreaterThan(area1);
			System.out.println("Shapes deleted on god");
			break;
		case 8:
			System.out.println("the tree has been printed to newshape.txt!");
			ShapeTreeNode newshapes = null;
			T.writeTree(newshapes);
			break;
			}
		}
    }
}
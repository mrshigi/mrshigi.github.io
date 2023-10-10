/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */
public class Shape
{
    public double area;
    public String type;
   
    //constructor
    Shape()
    {
    area = 0;
    type = "";
    }
   
    //method to return area
    public double getArea()
    {
        return area;
    }
   
    //method to return the type
    public String getType()
    {
    return type;
    }
   
    //print method
    public void print()
    {
    System.out.println(" Area: "+area);
    }
    public int compareTo(Shape other) 
    {
        if (this.area < other.area) 
        {
            return -1;
        } 
        else if (this.area > other.area) 
        {
            return 1;
        }
        else 
        {
            if (this.type.equals("Circle") && !other.type.equals("Circle")) {
                return -1;
            } else if (!this.type.equals("Circle") && other.type.equals("Circle")) {
                return 1;
            } else if (this.type.equals("Rectangle") && other.type.equals("Right Triangle")) {
                return -1;
            } else if (this.type.equals("Right Triangle") && other.type.equals("Rectangle")) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}


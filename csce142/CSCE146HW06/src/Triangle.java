/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */

public class Triangle extends Shape
{
    private double side1;
    private double side2;
   
    //Define the constructor the set the values
    public Triangle(double s1, double s2)
    {
        side1 = s1;
        side2 = s2;
        super.area = 0.5*side1*side2;
        super.type = "Right Triangle";
    }
   
    //Override the print() method
    public void print()
    {
    System.out.print("Right Triangle Side 1: "+side1+" Side 2: "+side2);
   
    //Call the print() method of the super class
    super.print();
    }
}
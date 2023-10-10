/*
 *Sean Raudat for CSCE 146, HW06, Trees but not the fun kind
 */

public class circle extends Shape
{
    private double radius;
   
    //Define the constructor the set the values
    public circle(double r)
    {
        radius = r;
        super.area = radius*radius*Math.PI;
        super.type = "Circle";
    }
   
    public void print()
    {
    System.out.print("Circle Radius: "+radius);
    super.print();
    }
}
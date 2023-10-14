/*
 *Sean Raudat for CSCE 146, Lab07
 */
public class Fruit implements Comparable<Fruit> 
{
    private String type;
    private double weight;
    public Fruit() 
    {
        this.type = "apple";
        this.weight = 1.0;
    }
    public Fruit(String type, double weight) 
    {
        setType(type);
        setWeight(weight);
    }
    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        if (type == null || (!type.equals("apple") && !type.equals("orange") &&
                !type.equals("banana") && !type.equals("kiwi") && !type.equals("tomato"))) 
        {
            this.type = "apple";
        } 
        else 
        {
            this.type = type;
        }
    }
    public double getWeight() 
    {
        return weight;
    }
    public void setWeight(double weight) 
    {
        if (weight <= 0) 
        {
            this.weight = 1.0;
        } 
        else 
        {
            this.weight = weight;
        }
    }
    public String toString() 
    {
        return "Type: " + type + " Weight: " + weight;
    }
    public int compareTo(Fruit other) 
    {
        if (other == null) 
        {
            return -1;
        }
        if (this.weight > other.weight) 
        {
            return 1;
        } 
        else if (this.weight < other.weight) 
        {
            return -1;
        } 
        else 
        {
            return this.type.compareTo(other.type);
        }
    }
}

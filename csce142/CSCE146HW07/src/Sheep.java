/*
 *Sean Raudat for CSCE 146, HW07 SHEEEEEEEEEEP
 */
public class Sheep implements Comparable<Sheep> 
{
        private String name;
        private int shearingTime;
        private int arrivalTime;

        public Sheep(String name, int shearingTime, int arrivalTime) 
        {
                super();
                this.name = name;
                this.shearingTime = shearingTime; //constructor shit
                this.arrivalTime = arrivalTime;
        }

        public String getName() 
        {
                return name;
        }

        public int getShearingTime() 
        {
                return shearingTime;
        }

        public int getArrivalTime() 
        {
                return arrivalTime;
        }

        @Override
        public int compareTo(Sheep o) 
        {
                int res = this.shearingTime - o.shearingTime;
                if (res == 0) 
                {
                        return this.name.compareTo(o.name);
                }
                else 
                {
                        return res;
                }
        }

        @Override
        public String toString() 
        {
                return "Name: " + name + ", Sheer Time: " + shearingTime + ", Arrival Time: " + arrivalTime;
        }
}
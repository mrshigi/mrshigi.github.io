
public class kikedestroyer {
	
	public static void main(String[] args) {
double[] array = {1.0,2.0,3.0,4.0,5.0};
double[] doubledArray = new double [array.length*2];
for(int i=0; i<array.length;i++) 
{
	doubledArray[i] = array[i];
}
for(int i=0;i<array.length;i++) 
{
	doubledArray[i+array.length] = array[i]*2.0;
}
for(int i=0;i<doubledArray.length;i++) 
{
	System.out.println(doubledArray[i]);
}
}
}

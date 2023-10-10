
public class jewdestroyer {
public static void main(String[] args) {
		int[] array = {36,25,80,95,54};
		int div4=0;
		int div5=0;
		for(int i=0;i<array.length;i=0) {
			if(array[i] % 4 == 0) {
				div4++;
			}
			else if (array[i] % 5 ==0 ) {
				div5++;
			}
		}
	System.out.println("Number of values div by 4:" +div4);
	System.out.println("Number of values div by 5:" +div5);
	}
}
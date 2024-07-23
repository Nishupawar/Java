public class DecimalToBinary {
    public static void main(String[] args) 
	{  
		
		 int n = 38;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		decToBinary(n);
		//System.out.println(Integer.toBinaryString(10));  
		  
	}
	private static void decToBinary(int n) {
		int[] binaryNum = new int[32];
		 
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
		
	}
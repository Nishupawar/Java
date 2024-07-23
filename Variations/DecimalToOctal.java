public class DecimalToOctal {
   public static void main(String[] args) 
	{
		int dec =12345;
		   myCode(dec);
	}
	//EndOfMainMethod
	private static void myCode(int dec)
	{   
		decToOctal(dec);
}
	private static void decToOctal(int dec) {
	int[] decNum = new int[100];
	int i=0;
	System.out.println("Oct number is : ");
	while(dec>0)
	{
		decNum[i]=dec%8;
		dec=dec/8;
		i++;
	}
	for(int j=i-1;j>=0;j--)
	{
		System.out.print(decNum[j]);
	}
	}
	
}

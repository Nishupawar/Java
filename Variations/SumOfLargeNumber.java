import java.math.BigInteger;

public class SumOfLargeNumber {
    public static void main(String[] args) 
	{
		String str1 = "12";
		String str2 = "198111";
		myCode(str1,str2);
	}
	//EndOfMainMethod
	public static void myCode(String str1,String str2) 
	{
		BigInteger b = new BigInteger(str1);
		BigInteger a = new BigInteger(str2);
		System.out.print(b.add(a));
	}
}


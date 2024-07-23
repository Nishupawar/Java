public class BinarytoDecimal {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		String b = "10001000";
		myCode(b);
	}
	//EndOfMainMethod
	public static void myCode(String binary1) 
	{
		int decimal1 = binaryToDecimal(binary1);
		System.out.println(decimal1);
	}
	public static int binaryToDecimal(String binary) 
	{
		int decimal = 0;
		int length = binary.length();
		for (int i = 0; i < length; i++) 
		{
			char digit = binary.charAt(i);
			int bitValue = Character.getNumericValue(digit);
			int power = length - 1 - i;
			decimal += bitValue * Math.pow(2, power);
		}
		return decimal;
	}
}

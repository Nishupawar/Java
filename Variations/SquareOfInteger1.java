public class SquareOfInteger1 {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int x = 11;
		myCode(x);
	}
	//EndOfMainMethod
	private static void myCode(int x)
	{
		System.out.print(floorSqrt(x));
	}
	static int floorSqrt(int x)
	{
		if (x == 0 || x == 1)
		return x;
		int i = 1, result = 1;
		while (result <= x) 
		{
			i++;
			result = i * i;
		}
		return i - 1;
	}
}

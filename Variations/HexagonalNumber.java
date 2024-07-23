public class HexagonalNumber {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 10;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.print(n+"th"+ " Hexagonal number is = "+n*(2*n-1));
	}
}

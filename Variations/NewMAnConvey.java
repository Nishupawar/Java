public class NewMAnConvey {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 10;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		System.out.println(sequence(n));
	}
	static int sequence(int n)
	{
		if (n == 1 || n == 2)
		return 1;
		else
		return sequence(sequence(n - 1)) 
		+ sequence(n - sequence(n - 1));
	}
}

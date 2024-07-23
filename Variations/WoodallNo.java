public class WoodallNo {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int x = 383;
		myCode(x);
	}
	//EndOfMainMethod
	private static void myCode(int x)
	{
		if(wood(x))
		System.out.println("Yes");
		else
		System.out.println("No");
	}
	private static boolean wood(int x)
	{
		if(x%2==0)
		return false;
		if(x==1)
		return true;
		x++;
		int p=0;
		while(x%2==0)
		{
			x=x/2;
			p++;
			if(p==x)
			return true;
		}
		return false;
	}
}

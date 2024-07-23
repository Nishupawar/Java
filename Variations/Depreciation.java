public class Depreciation {
    public static void main(String[] args) 
	{
		long amount,deppercent,year;
		amount=100000;
		deppercent=10;
		year=3;    
		myCode(amount,deppercent,year);
	}
	//EndOfMainMethod
	private static void myCode(long amount,long deppercent,long year)
	{
		for(int i=1;i<=year;i++)
		{
			amount =((100-deppercent)* amount)/100;
		}
		System.out.print("after depreciation = "+amount);
	}
}

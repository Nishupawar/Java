public class Pattern27 {
    public static void main(String[] args) 
	{
		int irange=9;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		char ch='A';
		int end=1;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch);
			}
			//ch++;
			if(i<5)
			{
				end++;
				ch++;
			}
			else
			{
				ch--;
				end--;
			}
			System.out.println();
		}
	}
}
// A
// BB
// CCC
// DDDD
// EEEEE
// DDDD
// CCC
// BB
// A
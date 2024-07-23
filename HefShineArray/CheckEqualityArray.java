package HefShineArray;

public class CheckEqualityArray {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5
		}
		;
		int[] b= 
		{
			1,2,3,5,4
		}
		;
		myCode(a,b);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int[] b) 
	{
		//WriteCode Here
		int cnt=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					cnt++;
				}
			}
			if(cnt==a.length)
			System.out.println("same");
			else
			System.out.println("not same");
		}
		else
		System.out.print("not same");
	}
}

public class CalculateMean {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			78 , 89 , 67 , 76
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[] a)
	{
		//Write code here
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int avg = sum/a.length;
		System.out.print(avg);
	}
}

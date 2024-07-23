package HefShineArray;

public class PrintArray {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			3,5,4,2,6,8,7,5,1,9
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

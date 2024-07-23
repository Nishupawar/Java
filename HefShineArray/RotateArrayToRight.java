package HefShineArray;

public class RotateArrayToRight {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			3,4,5,2,3,6,7,4
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	public static void myCode(int[]a)
	{
		//Write code here
		int temp= a[a.length-1];
		for(int i =a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

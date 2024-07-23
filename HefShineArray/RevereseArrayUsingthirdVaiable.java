package HefShineArray;

public class RevereseArrayUsingthirdVaiable {
    public static void main(String[] args) 
	{
		int[] a= 
		{
			1,2,3,4,5,6,7,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//Write code here
		int start=0;
		int end= a.length-1;
		while(start<=end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

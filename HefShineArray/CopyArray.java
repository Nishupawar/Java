package HefShineArray;

public class CopyArray {
    public static void main(String[] args) 
	{
		int[] a=
		{
			1,2,3,4,5,6,7,8
		}
		;
		int index=0;
		int[] b=new int[a.length];
		copyarray(a,index,b);
	}
	//EndOfMainMethod
	private static void copyarray(int[] a, int index, int[] b) 
	{
		//code here
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
			index++;
		}
	}
}

package HefShineArray;

public class QuickSort {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		int a[] = 
		{
			1,9,4,2,6,4,7,2,5
		}
		;	
		int n=a.length;
		myCode(a,n);
	}
	//EndOfMainMethod
	private static void myCode(int[] a,int n)
	{
		System.out.println("elements in array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nelements after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

package HefShineArray;

public class BinarySearch {
    public static void main(String[] args) 
	{
		int[] a=
		{
			23,45,67,88,90
		}
		;
		int num=90;
		int start=0;
		int end=a.length-1;
		
		int cnt=0;
		while(start<=end)
		{
			int mid= (start+end)/2;
			if(num==a[mid])
			{
				System.out.println("found at index "+mid);
				cnt++;
			}
			if(num>a[mid])
			{
				start= mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(cnt==0)
		System.out.println("index not found");
	}
}

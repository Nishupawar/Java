package HefShineArray;

public class MinArray {
    public static void main(String[] args) {
		int[] a= {34,67,26,1,2,21};
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}
}

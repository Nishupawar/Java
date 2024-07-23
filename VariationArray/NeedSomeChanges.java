package VariationArray;

import java.util.Arrays;

public class NeedSomeChanges {
    public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int temp=a[0];
		int temp1=a[1];
		for(int i=2;i<a.length;i++)
		{
			a[i-2]=a[i];
		}
		a[a.length-2]=temp1;
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));

	}
}

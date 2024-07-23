package VariationArray;
import java.util.*;
public class UnionOfArray {
    public static void main(String[] args) {
	int[] a= {1,2,3,4};
	int[] b= {2,4,5,6};
	
	int[] c=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		c[a.length+i]=b[i];
	}
//	for(int i=0;i<c.length;i++)
//	{
//		System.out.print(c[i]+" ");
//	}
	System.out.println(Arrays.toString(c));
	
	//unique
	for(int i=0;i<c.length;i++)
	{
		int cnt=0;
		for(int j=0;j<i;j++)
		{
			if(c[i]==c[j])
				cnt++;
		}
		if(cnt==0)
			System.out.print(c[i]+" ");
	}
}
}

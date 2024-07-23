package ArrayListconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sort {
   public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(30);
	al.add(50);
	al.add(20);
	al.add(40);
	System.out.println("ArrayList :"+al);
	
	//using arraylist
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
			
		{
			if(al.get(i)>al.get(j))
			{
				int temp= al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
			}
		}
	}
	System.out.println("ArrayList Collections : "+al);
	
	//using TreeSet
	TreeSet<Integer> ts= new TreeSet<>(al);
	System.out.println("TreeSet : "+ts);
	
	//using collections
	Collections.sort(al);
	System.out.println("Collections : "+al);
	
	//using array
	int[] a= new int[al.size()];
	int index=0;
	for(int data: al)
	{
		a[index++]=data;
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
}
}

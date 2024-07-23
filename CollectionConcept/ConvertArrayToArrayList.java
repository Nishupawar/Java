package CollectionConcept;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	
	ArrayList<Integer> al = new ArrayList<>();
	for(int data:a)
	{
		al.add(data);
	}
	System.out.println(al);
}
}

package CollectionConcept;

import java.util.ArrayList;

public class AddIterate {
    public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("red");
	al.add("white");
	al.add("blue");
	
	
	//using enhanced for loop
	for(String s:al)
	{
		System.out.println(s);
	}
	System.out.println();
	
	//using while loop
	int j=0;
	while(j<al.size())
	{
		System.out.println(al.get(j));
		j++;
	}
	System.out.println();
	
	//using for loop
	for(int i=0;i<al.size();i++)
	{
	    System.out.println(al.get(i));
	}
}
}

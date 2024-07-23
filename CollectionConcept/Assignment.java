package CollectionConcept;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment {
    public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<>();
	al.add("red");
	al.add("white");
	al.add("blue");
	
	Collections.reverse(al);
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
	
	Collections.shuffle(al);
	System.out.println(al);
	
	al.remove(2);
	System.out.println(al);
	
	al.set(1, "black");
	System.out.println(al);
	
	String color = al.get(1);
	System.out.println(color);
	
	al.add(0, "black");	
	System.out.println(al);
	
	
	
}
}

package CollectionConcept;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("red");
	al.add("white");
	al.add("blue");
	
	ArrayList<String> al2 = new ArrayList<>();
	al.add("red");
	al.add("white");
	al.add("blue");
	
	al.addAll(al2);
	System.out.println(al);
	
	al.equals(al2);
	System.out.println(al);
	
	List<String> subList = al.subList(1, 3);
	System.out.println(subList);
}
}

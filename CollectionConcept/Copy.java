package CollectionConcept;

import java.util.ArrayList;

public class Copy {
    public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("red");
	al.add("white");
	al.add("blue");
	
	ArrayList<String> al2 = new ArrayList<>(al);
	System.out.println(al2);
	
	al2= (ArrayList<String>) al.clone();
	System.out.println(al2);
	
	al2.addAll(al);
	System.out.println(al2);
}
}

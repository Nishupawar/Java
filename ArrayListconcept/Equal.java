package ArrayListconcept;

import java.util.ArrayList;

public class Equal {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.println(al);
	
	ArrayList<Integer> al2= new ArrayList<>();
	al2.add(10);
	al2.add(20);
	al2.add(30);
	
	
	System.out.println(al.equals(al2));
}
}
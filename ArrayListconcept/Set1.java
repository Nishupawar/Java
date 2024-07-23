package ArrayListconcept;

import java.util.ArrayList;

public class Set1 {
    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	
	al.set(1,21);
    al.set(2, 2);
    System.out.println(al);
	System.out.println(al.set(2,2));
}
}

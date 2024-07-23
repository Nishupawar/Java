package ArrayListconcept;

import java.util.ArrayList;

public class EmptyOrNot {
    public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al2= new ArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(380);
		
        System.out.println(al.isEmpty());
        
    //Returns true if this list contains the specified ele 
		System.out.println(al.contains(10));//true
		
	//Returns true if this collection contains all of the 
	//elementsin the specified collection.	
		System.out.println(al.containsAll(al2));//true
		
		
	}
}

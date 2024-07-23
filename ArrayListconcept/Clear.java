package ArrayListconcept;

import java.util.ArrayList;

public class Clear {
    public static void main(String[] args) {
	ArrayList<Integer> al2 = new ArrayList<>();
	al2.add(10);
	al2.add(60);
	al2.add(380);
	al2.add(45);
	
	System.out.println(al2);
	
	
	//after clear
	al2.clear();
	System.out.println("After Clear : "+al2);
}
}

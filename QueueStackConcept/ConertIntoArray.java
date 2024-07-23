package QueueStackConcept;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConertIntoArray {
    public static void main(String[] args) {
	PriorityQueue<String> queue= new PriorityQueue<>();
	queue.add("hi");
	queue.add("welcome");
	queue.add("to");
	queue.add("hefshine");
	System.out.println(queue);
	
	
	
	Object[] array= queue.toArray();
	System.out.println(Arrays.toString(array));
	
}
}

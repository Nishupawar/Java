package QueueStackConcept;

import java.util.PriorityQueue;

public class Count {
    public static void main(String[] args) {
	PriorityQueue<String> queue= new PriorityQueue<>();
	queue.add("hi");
	queue.add("welcome");
	queue.add("to");
	queue.add("hefshine");
	System.out.println(queue);
	
	//System.out.println();
	
	
	System.out.println(queue.size());
	
}
}

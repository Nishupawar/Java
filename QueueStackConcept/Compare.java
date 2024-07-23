package QueueStackConcept;

import java.util.PriorityQueue;

public class Compare {
    public static void main(String[] args) {
		PriorityQueue<String> queue= new PriorityQueue<>();
		queue.add("hi");
		queue.add("welcome");
		queue.add("to");
		queue.add("hefshine");
		
		PriorityQueue<String> queue1= new PriorityQueue<>();
		queue1.add("hi");
		queue1.add("welcome");
		queue1.add("to");
		queue1.add("hefshine");
		
		System.out.println(queue.containsAll(queue1));
		System.out.println(queue.equals(queue1));
		
	}
}

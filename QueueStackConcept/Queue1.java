package QueueStackConcept;

import java.util.PriorityQueue;

public class Queue1 {
    public static void main(String[] args) {
        //Integer
	PriorityQueue<Integer> queue= new PriorityQueue<>();
	queue.add(10);
	queue.add(40);
	queue.add(20);
	queue.add(30);
	System.out.println(queue);
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	
	//String
	PriorityQueue<String> queue1= new PriorityQueue<>();
	queue1.add("hi");
	queue1.add("welcome");
	queue1.add("to");
	queue1.add("hefshine");
	System.out.println(queue1);
	System.out.println(queue1.poll());
	System.out.println(queue1.poll());
	System.out.println(queue1.poll());
	System.out.println(queue1.poll());
    }
}

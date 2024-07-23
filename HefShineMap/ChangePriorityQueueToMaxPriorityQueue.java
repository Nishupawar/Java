package HefShineMap;

import java.util.PriorityQueue;

public class ChangePriorityQueueToMaxPriorityQueue {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
		pq1.add(36);
		pq1.add(25);
		pq1.add(26);
		pq1.add(70);  
		myCode(pq1);
	}
	//EndOfMainMethod
	public static void myCode(PriorityQueue<Integer> pq1) 
	{
		//write code here
		//System.out.print("\nMaximum Priority Queue: ");
		Integer val = null;
		while( (val = pq1.poll()) != null) 
		{
			System.out.print(val+" ");
		}
		//System.out.print("\n");
	}
}

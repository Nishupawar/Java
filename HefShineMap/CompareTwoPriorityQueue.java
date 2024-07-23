package HefShineMap;
import java.util.*;
public class CompareTwoPriorityQueue {
    
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq2 = new PriorityQueue<String>();  
		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		PriorityQueue<String> pq1 = new PriorityQueue<String>();  
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		myCode(pq1,pq2);
	}
	//EndOfMainMethod
	public static void myCode(PriorityQueue<String> pq1,PriorityQueue<String> pq2) 
	{
		//write code here
		 for (String element : pq1){
             System.out.println(pq2.contains(element) ? "Yes" : "No");
          } 
	}
}

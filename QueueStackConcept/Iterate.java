package QueueStackConcept;
import java.util.PriorityQueue;
import java.util.Iterator;
public class Iterate {
    public static void main(String[] args) {
        PriorityQueue<String> queue= new PriorityQueue<>();
        queue.add("hi");
        queue.add("welcome");
        queue.add("to");
        queue.add("hefshine");
        System.out.println(queue);
        
        System.out.println();
        
         Iterator<String> it=queue.iterator();
         while(it.hasNext()==true)
         {
             System.out.println(it.next());
         }
    
    System.out.println();
        
        for(String data: queue)
        {
            System.out.println(data);
        }
    }
}

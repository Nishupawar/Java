package MultithreadConcept;
class A extends Thread
 {
	 public void start()
	 {
		 System.out.println("Hello"+Thread.currentThread().getName());
	 }
	 
	 public void run()
	 {
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(Thread.currentThread().getName());
		 }
	 }
 }
public class Abc {
    public static void main(String[] args) {
        A thread1= new A();
        thread1.start();
        for(int i=0;i<5;i++)
         {
             System.out.println("Main Calling : "+Thread.currentThread().getName());
         } 
        

        }
}

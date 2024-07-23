package MultithreadConcept;
class T1 extends  Thread
{
    public void run()
        {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    
}
public class Test {
    public static void main(String[] args) {
        T1 t1= new T1();
        t1.setName("Child Thread");
        t1.start();

         for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        
    }
}

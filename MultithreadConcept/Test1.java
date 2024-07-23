package MultithreadConcept;
class T1 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Test1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
        T1 t1= new T1();
        Thread thread1 = new Thread(t1);
        thread1.setName("Thread 1");
        thread1.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

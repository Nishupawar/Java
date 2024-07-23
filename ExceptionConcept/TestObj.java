package ExceptionConcept;
class TestObject
{
	synchronized static void showMessage()
	{
		System.out.println("***");
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" says Sood Morning..");
		}
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		TestObject.showMessage();
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		TestObject.showMessage();
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		TestObject.showMessage();
	}
}
public class TestObj {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        MyThread1 thread3 = new MyThread1();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

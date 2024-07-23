package MultithreadConcept;
class Abcd 
{
	synchronized void m1(Abcd abcd2)
	{
		 System.out.println("in m1()....");
		 abcd2.m2();
	}
	synchronized void m2()
	{
		 System.out.println("in m2()...");
	}	
}
class Aa extends Thread
{
	Abcd abcd1;
	Abcd abcd2;
	
	public Aa(Abcd abcd1 , Abcd abcd2)
	{
		this.abcd1 = abcd1;
		this.abcd2 = abcd2;
		
	}
	
}
class B extends Thread
{
	Abcd abcd1;
	Abcd abcd2;
	
	public B(Abcd abcd1 , Abcd abcd2)
	{
		this.abcd1 = abcd1;
		this.abcd2 = abcd2;
		
	}
	public void run()
	{
		abcd2.m1(abcd1);
	}
}
public class MyClass1 {
    public static void main(String[] args) {
        Abcd abcd1 = new Abcd();
        Abcd abcd2 = new Abcd();
        
        Aa a = new Aa(abcd1,abcd2);
        B b = new B(abcd1,abcd2);
        
        
        a.start();
        b.start();
    }
}

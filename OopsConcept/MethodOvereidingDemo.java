package OopsConcept;

public class MethodOvereidingDemo {
    
void show()
{
	System.out.println("First");
}

}
 class xyz extends MethodOvereidingDemo
{
	void show()
	{
		System.out.println("Second");
	}
	public static void main(String[] args) 
	{
		MethodOvereidingDemo m = new MethodOvereidingDemo();
		m.show();
		
		xyz x = new xyz();
		x.show();
	}
}

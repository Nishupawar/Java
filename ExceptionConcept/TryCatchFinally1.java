package ExceptionConcept;
//exception not occur it execute upper part of try and then directly go finally
//but if we can't write catch block then it does execute the outside finally 
// s.o.p stmt.
//exception occur it go catch then go finally
public class TryCatchFinally1 
{
    public static void main(String[] args) 
{
	int a=100,b=2,c;
	
	System.out.println(1);
	try
	{
		System.out.println(2);
		c=a/b;
		System.out.println(c);
		System.out.println(3);
	}
	catch(Exception e)
	{
		System.out.println(4);
	}
//	//System.out.println(5);
	finally 
	{
		System.out.println(6);
	}
	System.out.println(7);
}
}

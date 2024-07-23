package Method;

import java.util.Scanner;

public class ArithmeticMethod 
{
 int a,b,add,sub,mult,div;
public static void main(String[] args) 
{
   ArithmeticMethod am = new ArithmeticMethod();
	am.input();
	am.process();
	am.output();
}
private void input() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Two Numbers : ");
	a= sc.nextInt();
	b=sc.nextInt();	
}
private void process() 
{
	add = a+b;
	sub= a-b;
	mult= a*b;
	div = a/b;	
}
private void output() 
{
   System.out.println("Sum : "+add);
   System.out.println("Substraction : "+sub);
   System.out.println("Multiplication : "+mult);
   System.out.println("Division : "+div);
}   
}

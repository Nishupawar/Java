import java.util.Scanner;
public class OpratorScanner{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		System.out.println("Enter Operator");
		char ch =sc.next().charAt(0);
		
		if(ch=='+')
			System.out.println(a+b);
		else if(ch=='-')
			System.out.println(a-b);
		else if(ch=='*')
			System.out.println(a*b);
		else if(ch=='/')
			System.out.println(a/b);
		else
			System.out.println("Invalid Operator");
	}
}
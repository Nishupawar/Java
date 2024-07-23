import java.util.Scanner;
public class  AlphabetNumber{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter AlphabetNumber");
      char ch= sc.next().charAt(0);
	  
	  if(ch>='A'&& ch<='Z')
		{
			System.out.println("UpperCase");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("lowerCase");
		}
		else if(ch>='0'&& ch<='9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("special symbol");
		}
      	  
	}
}
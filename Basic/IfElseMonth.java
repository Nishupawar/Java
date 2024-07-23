
import java.util.Scanner;

public class IfElseMonth {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a month no");
	int month= sc.nextInt();
	
	if(month>=1 &&  month<=3)
		System.out.println("First Qurater");
	
	else if(month>=4 && month<=6)
			System.out.println("Second Qurater");
	
	else if(month>=7 && month<=9)
		System.out.println("third Qurater");
	
	else if (month>=10 && month<=12)
		System.out.println("Last Qurater");
	else
		System.out.println("Invalid");
	
	
}
}

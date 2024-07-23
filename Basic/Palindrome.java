
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("Enter a no :");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int temp=num;
	int palindrome=0;
	while(num>0) {
		int rem=num%10;
		palindrome = palindrome*10+rem;
		num=num/10;	
	}
	//System.out.println(palindrome);
	if(temp==palindrome)
		System.out.println("palindrome number");
		else
		System.out.println("not palindrome number");
}
}



import java.util.Scanner;

public class HarshadNumber {
public static void main(String[] args) {
    System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int number=sc.nextInt();
	// num=81;
	int sum=0;
		int temp=number;
		while(number>0)
		{
			int rem =number%10;
			sum=sum+rem;
			number=number/10;
		}
		if(temp%sum==0)
		System.out.println("harshad number");
		else
		System.out.println("not harshad number");
	}
}

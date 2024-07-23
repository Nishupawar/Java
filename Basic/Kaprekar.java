
import java.util.*;
public class Kaprekar {
	 public static void main(String[]args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int number = sc.nextInt();
			int cnt=0;
		int sq= number*number;
		int temp=number;
		while(temp>0)
		{
			temp=temp/10;
			cnt++;
		}
		int pow= (int) Math.pow(10,cnt);
		int fpart= sq % pow;
		int spart= sq / pow;
		int sum= fpart+spart;
		if( sum==number)
		System.out.println("kaprekar number");
		else
		System.out.println("Not kaprekar Number");
	    }
	}
	        


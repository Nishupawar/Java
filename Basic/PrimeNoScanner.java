
import java.util.Scanner;
public class PrimeNoScanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no:");
	int num=sc.nextInt();
	int cnt=0;
	for(int i=2; i<=num-1; i++) {
		if(num%i==0)
			cnt++;
	}
	if(cnt==0)
		System.out.println("Prime No");
	else
		System.out.println("Not Prime No");
}
}

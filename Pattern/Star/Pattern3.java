import java.util.Scanner;

public class Pattern3 {
public static void main(String[] args) {
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	int numStars =1;
	boolean increment = true;
	while(numStars > 0) {
		for(int i=1;i<=numStars;i++) {
			System.out.print("* ");
		}
		System.out.println();
		
		if(increment)
			numStars++;
		else
			numStars--;
		if(numStars == num)
			increment =false;	
	}
}
}

//Scannrr=3
// *
// **
// ***
// **
// *

import java.util.Scanner;
public class SwitchMonth {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Input Month: ");
	int month= sc.nextInt();
	switch(month) {
	case 1:
	case 2:
	case 3:
		System.out.println("First Quarter");
		break;
		
	case 4:
	case 5:
	case 6:
		System.out.println("Second Quarter");
		break;
		
	case 7:
	case 8:
	case 9:
		System.out.println("Third Quarter");
		break;
		
	case 10:
	case 11:
	case 12:
	System.out.println("Last Quarter");
	break;
	
	default:
		System.out.println("Invalid Month");
	}
	
}
}

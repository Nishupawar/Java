
import java.util.Scanner;
public class EquilateralIsoscelesSceleneUser {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three Values");
	int side1= sc.nextInt();
	int side2= sc.nextInt();
	int side3= sc.nextInt();
	
	if(side1==side2 && side1==side3 && side2==side3)
		System.out.println("Equilateral Triangle");
	
	else if(side1==side2 || side1==side3 || side2==side3)
		System.out.println("Isosceles Triangle");
	
	else
		System.out.println("Scalene Triangle");
}
}

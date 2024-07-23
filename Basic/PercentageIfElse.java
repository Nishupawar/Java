
import java.util.Scanner;
public class PercentageIfElse {
public static void main(String[] args) {
	int marathi= 90;
	int hindi=89;
	int eng= 48;
	int sci=98;
	int soc =87;
	double totalMarks= marathi+hindi+eng+ sci + soc;
	System.out.println("totalMarks : " +totalMarks);
	
	double per = (totalMarks*100)/500;
	System.out.println("percentage: "+ per);
	
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter Marks");
	//int marks = sc.nextInt();
	if(per >=90) 
		System.out.println("Grade A");
	else if (per >=80 )
System.out.println("Grade B");
	else if (per >=70 )
		System.out.println("Grade C");
	else if (per >=60 )
		System.out.println("Grade D");
	else if (per >=40 )
		System.out.println("Grade E");
	else
		System.out.println("Fail");
}
}

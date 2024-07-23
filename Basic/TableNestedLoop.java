
import java.util.Scanner;
public class TableNestedLoop {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter n value : ");
	int n=sc.nextInt();
	
	//System.out.println("Enter j value : ");
	//int j= sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		//System.out.println(i+" "+j);
	System.out.println(i+"*"+ j+"="+ i*j);
	
			//System.out.println(i*j);
		}
		System.out.println(" ");
	}
}
}

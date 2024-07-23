import java.util.Scanner;
public class IfElse{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number");
int  num=sc.nextInt();
if(num>=10)
	System.out.println("big number");
else
	System.out.println("small number");
}
}
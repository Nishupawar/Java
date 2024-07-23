import java.util.Scanner;
public class Input{
public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);
sc.nextLine();
String c=sc.nextLine();
System.out.println(c);

int a= sc.nextInt();
System.out.println(a);
System.out.println("*****");

char b= sc.next().charAt(0);
System.out.println(b);

double d= sc.nextDouble();
System.out.println(d);

float e= sc.nextFloat();
System.out.println(e);


}
}
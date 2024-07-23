import java.util.Scanner;

public class Mymain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr no: ");
        int num= sc.nextInt();
        boolean b= NumberUtils.isPrime(num);
        if(b==true)
        System.out.println("prime");
        else
        System.out.println("not prime");

        System.out.print("Enter fact no: ");
        int num1= sc.nextInt();
        int fact= NumberUtils.factorial(num1);
        
    }
}

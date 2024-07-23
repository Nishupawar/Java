import java.util.Scanner;
public class CalculatorSwitch{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Operator :");
        char ch = sc.next().charAt(0);
        System.out.println("Enter value of a:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        switch (ch) {
            case '+':
                System.out.println(a+b);
                break;
                 case '-':
                System.out.println(a-b);
                break;
                 case '*':
                System.out.println(a*b);
                break;
                 case '/':
                System.out.println(a/b);
                break;
        
            default:
            System.out.println("Inavlid operator");
                break;
        }
    }
}
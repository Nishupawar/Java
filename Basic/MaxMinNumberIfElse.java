import java.util.Scanner;

public class MaxMinNumberIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) 
        {
            System.out.println("A is max");
            if (b < c)
                System.out.println("b is min");
            else
                System.out.println("c is min");
        } 
        else if (b > a && b > c)
         {
            System.out.println(" b is max");
            if (a < c)
                System.out.println("a is min");
            else
                System.out.println("c is min");
        } 
        else 
        {
            System.out.println("c is max");
            if (a < b)
                System.out.println("a is min");
            else
                System.out.println("b is min");
        }
    }
}
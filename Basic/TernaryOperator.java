import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        // variable ==condition ?trueExpression : falseExpression;
        int a = 4, b = 8;
        int larger;
        if (a > b)
            larger = a;
        else
            larger = b;
        System.out.println("Larger using if else is " + larger);

        larger = (a > b) ? a : b;
        System.out.println("Larger using ternary is : " + larger);
    }
}

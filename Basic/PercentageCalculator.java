import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks 1: ");
        int marks1 = input.nextInt();
        System.out.print("Enter marks 2: ");
        int marks2 = input.nextInt();
        System.out.print("Enter total marks: ");
        int totalMarks = input.nextInt();

        int percentage = (marks1 + marks2) * 100 / totalMarks;
        if ((marks1 + marks2) % totalMarks != 0) {
            percentage++;
        }

        System.out.println("Percentage: " + percentage + "%");
    }
}

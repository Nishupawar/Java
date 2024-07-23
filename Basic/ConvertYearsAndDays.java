import java.util.Scanner;

public class ConvertYearsAndDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        // calculate the number of years and days
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24 * 60);

        // display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        double result = (percentage / 100) * number;
        System.out.println("The result is: " + result);
    }
}

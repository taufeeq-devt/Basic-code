import java.util.*;
public class FutrueValur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total amount of money: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();

        double futureValue = principal * Math.pow(1 + interestRate, numYears);

        System.out.printf("The future value of your investment is: $%.2f%n", futureValue);
    }
}

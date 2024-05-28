import java.util.Random;
import java.util.Scanner;
public class GussingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the guessing game! I'm thinking of a number between 1 and 100. Can you guess what it is?");

        int secretNumber = random.nextInt(100) + 1;
        int numGuesses = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number in " + numGuesses + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }

}

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
50        while (true) {
            int lowerBound = 1;
            int upperBound = 100;
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int maxAttempts = 5;
            int attempts = 0;
            int guess;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }
        }
    }
}
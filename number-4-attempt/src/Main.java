import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(1000) + 1;
            int userGuess = 0;
            int attempts = 0;

            System.out.println("Guess a number between 1 and 1000.");

            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}
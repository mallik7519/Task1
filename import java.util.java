import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 10...");

        while (userGuess != 2) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess > 2) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < 2) {
                System.out.println("Too low! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number: 2");
        System.out.println("It took you " + attempts + " attempts.");
    }
}
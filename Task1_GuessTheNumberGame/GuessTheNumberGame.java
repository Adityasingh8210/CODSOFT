package Task1_GuessTheNumberGame;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {

    static Scanner input = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("🎮 Welcome to Guess The Number Game 🎮");
        System.out.println("-------------------------------------");
        boolean playMore;

        do {
            playRound();
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = input.next().toLowerCase();
            playMore = response.equals("yes") || response.equals("y");
        } while (playMore);

        System.out.println("\nThanks for playing! Your final score: " + score);
    }

    public static void playRound() {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;
        int maxAttempts = 7;
        boolean isGuessed = false;

        System.out.println("\nI've selected a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " chances to guess it correctly!");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess → ");
            int userGuess = input.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("🎉 Awesome! You guessed the number in " + attempt + " attempts.");
                score += 10;
                isGuessed = true;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("📉 Too low! Try a higher number.");
            } else {
                System.out.println("📈 Too high! Try a smaller number.");
            }
        }

        if (!isGuessed) {
            System.out.println("😞 You've used all attempts! The correct number was: " + secretNumber);
        }
    }
}

// NumberGuessingGame.java
// Author: Himaja Akula
// Description: Simple number guessing game using random number generation.

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;
        int guess, attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > numberToGuess)
                System.out.println("Too high! Try again.");
            else if (guess < numberToGuess)
                System.out.println("Too low! Try again.");
            else
                System.out.println("🎉 Correct! You guessed in " + attempts + " attempts.");

        } while (guess != numberToGuess);


    }
}

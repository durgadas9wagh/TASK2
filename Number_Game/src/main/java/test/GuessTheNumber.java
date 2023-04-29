package test;


import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5; // Maximum number of attempts allowed
        int totalRounds = 3; // Number of rounds to play
        int totalScore = 0; // Total score across all rounds
        
        
        
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("Round " + round);
            int secretNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            int attempts = 0;
            int score = 0;
            
            System.out.println("Guess the number between 1 and 100.");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attempts++;
                
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += maxAttempts - attempts + 1; // Add score based on remaining attempts
                    System.out.println("Score: " + score);
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is lower than the specail number.");
                } else {
                    System.out.println("Your guess is higher than the specail number.");
                }
                
                if (attempts == maxAttempts) {
                    System.out.println("Oops! You've reached the maximum number of attempts.");
                    System.out.println("The specail number was: " + secretNumber);
                } else {
                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                }
            }
            
            totalScore += score; // Add current round score to total score
        }
        
        System.out.println("Game over! Total score: " + totalScore);
        
        input.close();
    }
}
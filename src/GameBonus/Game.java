package GameBonus;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int gameID;

    // Constructor
    public Game(int gameID) {
        this.gameID = gameID;
    }


    // Method to convert currency
    public void currencyConvertor(double amountILS, String currency) {
        double convertedAmount;
        String upperCurrency = currency.toUpperCase();

        switch (upperCurrency) {
            case "USD":
                convertedAmount = amountILS / 3.69; // Current conversion rate 2024.08.25
                break;
            case "EUR":
                convertedAmount = amountILS / 4.13; // Current conversion rate 2024.08.25
                break;
            case "JPY":
                convertedAmount = amountILS / 0.026; // Current conversion rate 2024.08.25
                break;
            case "GBP":
                convertedAmount = amountILS / 4.88; // Current conversion rate 2024.08.25
                break;
            default:
                System.out.println("Error: Invalid currency type.");
                return;
        }

        System.out.println("The converted amount in " + upperCurrency + ": " + convertedAmount);
    }

    // Method to capitalize the first letter of each word and separate with a period
    public void upperFirst(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(word.toUpperCase().charAt(0)).append(".");
            }
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
            System.out.println("Your initials are: " + result);
        } else {
            System.out.println("Your initials are: " + result);
        }

    }

    // Method for guessing the number game
    public void guessTheNumber() {
        Random random = new Random();
        int correctNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Attempt " + attempt + ": Guess a number between 1 and 10: ");
            int userGuess = scanner.nextInt();

            if (userGuess == correctNumber) {
                System.out.println("You Win!");
                hasGuessedCorrectly = true;
                break;
            } else {
                System.out.println("OOPS! Failed to guess number.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("You failed! The correct answer is " + correctNumber + ". Game Over!");
        }
    }
}

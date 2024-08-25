package Game01;

import java.util.Scanner;

public class Game {
    private int gameID;

    // Constructor
    public Game(int gameID) {
        this.gameID = gameID;
    }

    // Method to convert currency
    public void currencyConvertor(double amountILS, String currency) {
        double convertedAmount = 0;
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
        }

        System.out.println("Your initials are: " + result.toString());
    }
}

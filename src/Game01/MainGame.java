package Game01;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(1);

        System.out.println("Please choose your game:");
        System.out.println("1. Currency Converter");
        System.out.println("2. Get Your Initials");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter amount in ILS: ");
            double amountILS = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Choose a currency to convert into (USD, EUR, JPY, GBP): ");
            String currency = scanner.nextLine();
            game.currencyConvertor(amountILS, currency);
        } else if (choice == 2) {
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();
            game.upperFirst(fullName);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
